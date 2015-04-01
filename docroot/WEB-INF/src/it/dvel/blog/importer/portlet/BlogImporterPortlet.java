
package it.dvel.blog.importer.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portlet.blogs.service.BlogsEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.remote.axis.BlogsEntrySoap;
import com.liferay.remote.axis.MBMessageSoap;
import com.liferay.util.bridges.mvc.MVCPortlet;

import it.dvel.blog.importer.util.RemoteServiceUtil;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.apache.axis.AxisFault;
import org.apache.tika.mime.MimeType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.mime.MimeTypes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Portlet implementation class BlogImporterPortlet
 * 
 * @author Marco Napolitano, D'vel snc
 */
public class BlogImporterPortlet extends MVCPortlet {

	private static final Log _log =
		LogFactoryUtil.getLog(BlogImporterPortlet.class);

	public void blogImport(
		ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay =
			(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		String virtualHost = ParamUtil.getString(actionRequest, "virtualHost");
		String protocol = ParamUtil.getString(actionRequest, "protocol");
		String username = ParamUtil.getString(actionRequest, "username");
		String password = ParamUtil.getString(actionRequest, "password");
		int max = ParamUtil.getInteger(actionRequest, "max");
		boolean removeEntries =
			ParamUtil.getBoolean(actionRequest, "removeEntries");
		boolean includeAnonymousComments =
			ParamUtil.getBoolean(actionRequest, "includeAnonymousComments");

		_log.info("Parametro virtualhost: " + virtualHost);
		_log.info("Parametro protocol: " + protocol);
		_log.info("Parametro username: " + username);
		_log.info("Parametro password: _EHI_THIS_IS_A_SECRET_");
		_log.info("Parametro max: " + max);
		_log.info("Parametro removeEntries: " + removeEntries);
		_log.info("Parametro includeAnonymousComments: " +
			includeAnonymousComments);

		long start = System.currentTimeMillis();

		try {
			String baseUri = protocol + Http.PROTOCOL_DELIMITER + virtualHost;

			RemoteServiceUtil remoteServiceUtil =
				new RemoteServiceUtil(username, password, baseUri);

			long remoteCompanyId = remoteServiceUtil.getCompanyId(virtualHost);
			long remoteGroupId = remoteServiceUtil.getGroupId(remoteCompanyId);

			if (removeEntries) {
				_log.info("Rimozione post esistenti per il sito corrente " +
					themeDisplay.getScopeGroupId() + StringPool.TRIPLE_PERIOD);
				BlogsEntryLocalServiceUtil.deleteEntries(themeDisplay.getScopeGroupId());
			}

			_log.info("Inizio recupero blogs entry (max " + max + ")...");
			BlogsEntrySoap[] remoteBlogEntries =
				remoteServiceUtil.getBlogGroupEntries(remoteGroupId, max);
			_log.info("Blogs entry recuperati: " + remoteBlogEntries.length);

			ServiceContext serviceContext =
				ServiceContextFactory.getInstance(actionRequest);
			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);

			Map<Long, List<MBMessageSoap>> messages =
				remoteServiceUtil.initBlogDiscussions(
					remoteCompanyId, includeAnonymousComments);

			for (int i = 0; i < remoteBlogEntries.length; i++) {
				BlogsEntrySoap remoteEntry = remoteBlogEntries[i];

				_log.info("Importazione elemento " + (i + 1) + "/" +
					remoteBlogEntries.length + ": " + remoteEntry.getTitle());

				User user =
					remoteServiceUtil.getUser(
						themeDisplay.getCompanyId(),
						themeDisplay.getScopeGroupId(),
						themeDisplay.getUserId(), remoteCompanyId,
						remoteEntry.getUserId(), baseUri);

				Calendar calendar = remoteEntry.getDisplayDate();

				String[] tagNames =
					remoteServiceUtil.getTagNames(remoteEntry.getEntryId());
				serviceContext.setAssetTagNames(tagNames);

				String content =
					sanitizeContent(
						themeDisplay, remoteEntry.getContent(), baseUri);

				BlogsEntry entry =
					BlogsEntryLocalServiceUtil.addEntry(
						user.getUserId(), remoteEntry.getTitle(),
						StringPool.BLANK, content,
						calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DATE),
						calendar.get(Calendar.YEAR),
						calendar.get(Calendar.HOUR_OF_DAY),
						calendar.get(Calendar.MINUTE), false,
						remoteEntry.isAllowTrackbacks(),
						StringUtil.split(remoteEntry.getTrackbacks()), false,
						null, null, null, serviceContext);

				entry.setUuid(remoteEntry.getUuid());
				entry.setCreateDate(remoteEntry.getCreateDate().getTime());
				entry.setModifiedDate(remoteEntry.getModifiedDate().getTime());
				BlogsEntryLocalServiceUtil.updateBlogsEntry(entry);

				remoteServiceUtil.addDiscussions(
					user.getUserId(), entry, remoteEntry,
					messages.get(remoteEntry.getEntryId()));
			}
		}
		catch (Exception e) {
			_log.error(e);

			throw e;
		}

		long stop = System.currentTimeMillis();

		_log.info("Importazione terminata in " + (stop - start) + "ms");
	}

	private String getFileName(InputStream inputStream) {

		String fileName = String.valueOf(System.currentTimeMillis());

		String contentType =
			MimeTypesUtil.getContentType(inputStream, fileName);

		try {
			MimeTypes mimeTypes = MimeTypes.getDefaultMimeTypes();
			MimeType mimeType = mimeTypes.forName(contentType);

			return fileName + mimeType.getExtension();
		}
		catch (MimeTypeException e) {
			return fileName;
		}
	}

	private Folder getFolder(
		long parentFolderId, String name, String description, boolean create,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		try {
			return DLAppLocalServiceUtil.getFolder(
				serviceContext.getScopeGroupId(), parentFolderId, name);
		}
		catch (PortalException e) {
			if (create)
				return DLAppLocalServiceUtil.addFolder(
					serviceContext.getUserId(),
					serviceContext.getScopeGroupId(), parentFolderId, name,
					description, serviceContext);
			else
				throw (e);
		}
	}

	private String getThumbnailURL(
		long imageFileEntryId, ThemeDisplay themeDisplay) {

		try {
			String imageUrl =
				DLUtil.getPreviewURL(
					DLAppLocalServiceUtil.getFileEntry(imageFileEntryId), null,
					themeDisplay, StringPool.BLANK, false, true);

			return imageUrl;
		}
		catch (Exception e) {
			return StringPool.BLANK;
		}
	}

	private String sanitizeContent(
		ThemeDisplay themeDisplay, String content, String baseUri) {

		if (Validator.isNull(content))
			return content;

		String text =
			StringUtil.replace(content, "<p>&nbsp;</p>", StringPool.BLANK);
		text = StringUtil.replace(text, "&nbsp;", StringPool.BLANK);

		// Istanzio il parser HTML
		Document document = Jsoup.parse(text);
		// Recupero tutte le immagini che puntano alla Document Library
		Elements images = document.select("img[src^=/image/image_gallery?]");

		if (images.size() > 0) {
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);
			serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
			serviceContext.setUserId(themeDisplay.getUserId());

			try {
				Folder folder =
					getFolder(
						DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
						"blog_images", null, true, serviceContext);

				for (Element image : images) {
					try {
						// Tutti i link delle immagini remote sono del tipo
						// /image/image_gallery?uuid=18435dd2-fcd4-4b74-bb9e-d8692a0d4414&groupId=12536&t=1358924925314
						String remoteImageURL = baseUri + image.attr("src");

						// Scarico l'immagine remota
						byte[] bytes = HttpUtil.URLtoByteArray(remoteImageURL);
						InputStream inputStream =
							new ByteArrayInputStream(bytes);

						String fileName = getFileName(inputStream);
						String contentType =
							MimeTypesUtil.getContentType(inputStream, fileName);

						FileEntry fileEntry =
							DLAppLocalServiceUtil.addFileEntry(
								themeDisplay.getUserId(),
								themeDisplay.getScopeGroupId(),
								folder.getFolderId(), fileName, contentType,
								fileName, null, null, bytes, serviceContext);

						// Tutti i link delle immagini locali sono del tipo
						// /documents/35012/108954/accept.png/167c9fa4-9d81-4ec4-85cb-1e921c2ee475?t=1427368312253
						String imageURL =
							getThumbnailURL(
								fileEntry.getFileEntryId(), themeDisplay);
						image.attr("src", imageURL);
					}
					catch (IOException e) {
						_log.error(e);
					}
				}
			}
			catch (PortalException | SystemException e) {
				_log.error(e);
			}

			text = document.body().html();
		}

		return text;
	}

	@Override
	protected boolean isSessionErrorException(Throwable cause) {

		if (cause instanceof AxisFault)
			return true;

		return super.isSessionErrorException(cause);
	}
}

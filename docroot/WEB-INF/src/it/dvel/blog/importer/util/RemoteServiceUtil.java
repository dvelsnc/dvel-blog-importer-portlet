
package it.dvel.blog.importer.util;

import com.liferay.portal.NoSuchCompanyException;
import com.liferay.portal.NoSuchGroupException;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portlet.messageboards.model.MBDiscussion;
import com.liferay.portlet.messageboards.model.MBMessage;
import com.liferay.portlet.messageboards.service.MBDiscussionLocalServiceUtil;
import com.liferay.portlet.messageboards.service.MBMessageLocalServiceUtil;
import com.liferay.remote.axis.BlogsEntryServiceSoap;
import com.liferay.remote.axis.BlogsEntryServiceSoapServiceLocator;
import com.liferay.remote.axis.BlogsEntrySoap;
import com.liferay.remote.axis.ClassNameServiceSoap;
import com.liferay.remote.axis.ClassNameServiceSoapServiceLocator;
import com.liferay.remote.axis.CompanyServiceSoap;
import com.liferay.remote.axis.CompanyServiceSoapServiceLocator;
import com.liferay.remote.axis.CompanySoap;
import com.liferay.remote.axis.GroupServiceSoap;
import com.liferay.remote.axis.GroupServiceSoapServiceLocator;
import com.liferay.remote.axis.GroupSoap;
import com.liferay.remote.axis.MBMessageServiceSoap;
import com.liferay.remote.axis.MBMessageServiceSoapServiceLocator;
import com.liferay.remote.axis.MBMessageSoap;
import com.liferay.remote.axis.Portal_ClassNameServiceSoapBindingStub;
import com.liferay.remote.axis.Portal_CompanyServiceSoapBindingStub;
import com.liferay.remote.axis.Portal_GroupServiceSoapBindingStub;
import com.liferay.remote.axis.Portal_RoleServiceSoapBindingStub;
import com.liferay.remote.axis.Portal_UserServiceSoapBindingStub;
import com.liferay.remote.axis.Portlet_Blogs_BlogsEntryServiceSoapBindingStub;
import com.liferay.remote.axis.Portlet_MB_MBMessageServiceSoapBindingStub;
import com.liferay.remote.axis.Portlet_Tags_TagsEntryServiceSoapBindingStub;
import com.liferay.remote.axis.RoleServiceSoap;
import com.liferay.remote.axis.RoleServiceSoapServiceLocator;
import com.liferay.remote.axis.RoleSoap;
import com.liferay.remote.axis.TagsEntryServiceSoap;
import com.liferay.remote.axis.TagsEntryServiceSoapServiceLocator;
import com.liferay.remote.axis.TagsEntrySoap;
import com.liferay.remote.axis.UserServiceSoap;
import com.liferay.remote.axis.UserServiceSoapServiceLocator;
import com.liferay.remote.axis.UserSoap;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.xml.rpc.ServiceException;

/**
 * Classe di utility per interfacciarsi con i web service remoti
 * 
 * @author Marco Napolitano, D'vel snc
 */
public class RemoteServiceUtil {

	private static final Log _log =
		LogFactoryUtil.getLog(RemoteServiceUtil.class);

	private final BlogsEntryServiceSoapServiceLocator blogsEntryLocator;
	private final ClassNameServiceSoapServiceLocator classNameLocator;
	private final CompanyServiceSoapServiceLocator companyLocator;
	private final GroupServiceSoapServiceLocator groupLocator;
	private final MBMessageServiceSoapServiceLocator mbMessageLocator;
	private final String password;
	private final String remoteBaseUri;
	private long remoteClassNameId;
	private final RoleServiceSoapServiceLocator roleLocator;
	private final TagsEntryServiceSoapServiceLocator tagsEntryLocator;
	private final UserServiceSoapServiceLocator userLocator;

	private final String username;

	/**
	 * Costruttore della classe
	 * 
	 * @param username
	 *            Nome utente per l'autenticazione ai web service
	 * @param password
	 *            Password per l'autenticazione ai web service
	 */
	public RemoteServiceUtil(String username, String password, String baseUri) {

		this.username = username;
		this.password = password;
		this.remoteBaseUri = baseUri;

		this.blogsEntryLocator = new BlogsEntryServiceSoapServiceLocator();
		this.classNameLocator = new ClassNameServiceSoapServiceLocator();
		this.companyLocator = new CompanyServiceSoapServiceLocator();
		this.groupLocator = new GroupServiceSoapServiceLocator();
		this.mbMessageLocator = new MBMessageServiceSoapServiceLocator();
		this.roleLocator = new RoleServiceSoapServiceLocator();
		this.tagsEntryLocator = new TagsEntryServiceSoapServiceLocator();
		this.userLocator = new UserServiceSoapServiceLocator();

		try {
			this.remoteClassNameId =
				getClassNameService().getClassNameId(BlogsEntry.class.getName());
		}
		catch (IOException | ServiceException e) {
			this.remoteClassNameId = 0L;
		}
	}

	public void addDiscussions(
		long userId, BlogsEntry entry, BlogsEntrySoap remoteEntry,
		List<MBMessageSoap> remoteMessages)
		throws SystemException, PortalException {

		long companyId = entry.getCompanyId();
		long groupId = entry.getGroupId();

		if (remoteMessages != null && remoteMessages.size() > 0) {
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setScopeGroupId(groupId);
			serviceContext.setAddGroupPermissions(true);
			serviceContext.setAddGuestPermissions(true);

			/*
			 * Sembra che la creazione di un post del blog, crei in automatico
			 * anche la struttura di base di MBThread, MBDiscussion e MBMessage;
			 * nel caso della MBDiscussion questa viene identificata
			 * univocamente dalla entity associata e quindi la recupero
			 */
			MBDiscussion discussion =
				MBDiscussionLocalServiceUtil.fetchDiscussion(
					BlogsEntry.class.getName(), entry.getPrimaryKey());

			// Se per qualche motivo la discussione fosse null,
			// ignoro in toto l'importazione dei commenti
			if (discussion != null) {
				// Recupero il messaggio radice del post corrente
				MBMessage rootMessage =
					getRootMessage(
						groupId, entry.getEntryId(), discussion.getThreadId());

				if (rootMessage != null) {
					Map<Long, Long> messagesMapping = new HashMap<Long, Long>();

					// Imposto il mapping dell'elemento radice
					messagesMapping.put(
						remoteMessages.get(0).getPrimaryKey(),
						rootMessage.getPrimaryKey());

					// Ciclo finchè non ho mappato tutti i messaggi remoti
					while (messagesMapping.size() != remoteMessages.size()) {
						for (MBMessageSoap remoteMessage : remoteMessages) {
							// Se il mapping NON contiene già il messaggio
							// remoto allora devo andare avanti per capire se
							// posso inserirlo
							if (!messagesMapping.containsKey(remoteMessage.getPrimaryKey())) {
								// Se il mapping contiene già il parent message
								// a cui fa riferimento quello corrente, procedo
								// con l'aggiunta
								if (messagesMapping.containsKey(remoteMessage.getParentMessageId())) {
									// Recupero l'utente che scritto il commento
									// oppure lo creo se non esiste
									User commentary =
										getUser(
											companyId, groupId, userId,
											remoteMessage.getGroupId(),
											remoteMessage.getUserId(),
											remoteBaseUri);

									long parentMessageId =
										messagesMapping.get(remoteMessage.getParentMessageId());

									MBMessage message =
										MBMessageLocalServiceUtil.addDiscussionMessage(
											commentary.getUserId(),
											commentary.getFullName(), groupId,
											BlogsEntry.class.getName(),
											entry.getPrimaryKey(),
											discussion.getThreadId(),
											parentMessageId,
											remoteMessage.getSubject(),
											remoteMessage.getBody(),
											serviceContext);

									messagesMapping.put(
										remoteMessage.getPrimaryKey(),
										message.getPrimaryKey());
								}
							}
						}
					}
				}
			}
		}
	}

	public BlogsEntrySoap[] getBlogGroupEntries(long remoteGroupId, int max) {

		try {
			return getBlogsEntryService().getGroupEntries(remoteGroupId, max);
		}
		catch (IOException | ServiceException e) {
			return new BlogsEntrySoap[0];
		}
	}

	public long getCompanyId(String virtualHost)
		throws NoSuchCompanyException {

		try {
			_log.info("Recupero company per il virtualhost " + virtualHost +
				StringPool.TRIPLE_PERIOD);
			CompanySoap company =
				getCompanyService().getCompanyByVirtualHost(virtualHost);
			_log.info("Company recuperata: " + company.getCompanyId());

			return company.getCompanyId();
		}
		catch (Exception e) {
			_log.error(e);

			throw new NoSuchCompanyException();
		}
	}

	public long getGroupId(long remoteGroupId)
		throws NoSuchGroupException {

		try {
			_log.info("Recupero gruppo " + GroupConstants.GUEST +
				" per la company " + remoteGroupId + StringPool.TRIPLE_PERIOD);
			GroupSoap group =
				getGroupService().getGroup(remoteGroupId, GroupConstants.GUEST);
			_log.info("Gruppo recuperato: " + group.getGroupId());

			return group.getGroupId();
		}
		catch (Exception e) {
			_log.error(e);

			throw new NoSuchGroupException();
		}
	}

	public MBMessageSoap[] getMBMessages() {

		try {
			return getMBMessageService().getCategoryMessages(
				0, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		}
		catch (IOException | ServiceException e) {
			return new MBMessageSoap[0];
		}
	}

	public String[] getTagNames(long remoteEntryId) {

		try {
			TagsEntrySoap[] tagsEntries =
				getTagsEntryService().getEntries(
					BlogsEntry.class.getName(), remoteEntryId);

			String[] tagNames = new String[tagsEntries.length];

			for (int i = 0; i < tagsEntries.length; i++) {
				TagsEntrySoap tagsEntry = tagsEntries[i];
				tagNames[i] = tagsEntry.getName();
			}

			return tagNames;
		}
		catch (IOException | ServiceException e) {
			return new String[0];
		}
	}

	public User getUser(
		long companyId, long groupId, long userId, long remoteGroupId,
		long remoteUserId, String remoteBaseUri)
		throws PortalException, SystemException {

		_log.info("Recupero utente remoto " + remoteUserId +
			StringPool.TRIPLE_PERIOD);

		UserSoap userSoap = null;
		try {
			userSoap = getUserService().getUserById(remoteUserId);
		}
		catch (IOException | ServiceException e) {
			throw new NoSuchUserException();
		}

		_log.info("Ricerca utente locale " + userSoap.getEmailAddress() +
			" per email e per screenname");
		User user =
			UserLocalServiceUtil.fetchUserByEmailAddress(
				companyId, userSoap.getEmailAddress());
		if (user == null)
			user =
				UserLocalServiceUtil.fetchUserByScreenName(
					companyId, userSoap.getScreenName());

		if (user == null) {
			_log.warn("Utente locale non trovato: creazione nuovo utente locale");

			Locale locale = LocaleUtil.fromLanguageId(userSoap.getLanguageId());

			ServiceContext serviceContext = new ServiceContext();

			user =
				UserLocalServiceUtil.addUser(
					userId, companyId, false, "pippo", "pippo", false,
					userSoap.getScreenName(), userSoap.getEmailAddress(), 0L,
					userSoap.getOpenId(), locale, userSoap.getFirstName(),
					userSoap.getMiddleName(), userSoap.getLastName(), 0, 0,
					true, 0, 1, 1970, userSoap.getJobTitle(), new long[] {
						groupId
					}, new long[0], new long[0], new long[0], false,
					serviceContext);

			user.setComments(userSoap.getComments());
			user.setFailedLoginAttempts(userSoap.getFailedLoginAttempts());
			user.setGraceLoginCount(userSoap.getGraceLoginCount());
			user.setGreeting(userSoap.getGreeting());
			if (userSoap.getLastFailedLoginDate() != null)
				user.setLastFailedLoginDate(userSoap.getLastFailedLoginDate().getTime());
			if (userSoap.getLastLoginDate() != null)
				user.setLastLoginDate(userSoap.getLastLoginDate().getTime());
			user.setLastLoginIP(userSoap.getLastLoginIP());
			user.setLockout(userSoap.isLockout());
			if (userSoap.getLockoutDate() != null)
				user.setLockoutDate(userSoap.getLockoutDate().getTime());
			if (userSoap.getLoginDate() != null)
				user.setLoginDate(userSoap.getLoginDate().getTime());
			user.setLoginIP(userSoap.getLoginIP());
			user.setReminderQueryAnswer(userSoap.getReminderQueryAnswer());
			user.setReminderQueryQuestion(userSoap.getReminderQueryQuestion());
			user.setTimeZoneId(userSoap.getTimeZoneId());
			user = UserLocalServiceUtil.updateUser(user);

			_log.info("Associazione ruoli utente...");
			RoleSoap[] remoteRoles = getUserRoles(remoteUserId);
			for (RoleSoap remoteRole : remoteRoles) {
				// Verifico se in locale esiste già un ruolo con lo stesso nome
				Role role =
					RoleLocalServiceUtil.fetchRole(
						companyId, remoteRole.getName());

				if (role == null) {
					_log.info("Il ruolo " + remoteRole.getName() +
						" non esiste; creazione nuovo ruolo");

					// Se il ruolo non esiste in locale, lo creo e poi lo
					// associerò sotto
					role =
						RoleLocalServiceUtil.addRole(
							userId,
							null,
							0,
							remoteRole.getName(),
							LocalizationUtil.getLocalizationMap(remoteRole.getTitle()),
							LocalizationUtil.getLocalizationMap(remoteRole.getDescription()),
							remoteRole.getType(), remoteRole.getSubtype(),
							serviceContext);
				}

				if (!ArrayUtil.contains(user.getRoleIds(), role.getRoleId())) {
					_log.info("Associazione ruolo " + role.getName() +
						" all'utente " + user.getEmailAddress());

					// Se il ruolo esiste in locale ma non è associato
					// all'utente, lo associo
					RoleLocalServiceUtil.addUserRole(
						user.getUserId(), role.getRoleId());
				}
			}

			new DownloadUserPortrait(
				user.getUserId(), remoteBaseUri, userSoap.getPortraitId()).start();

			_log.info("Utente locale creato: " + user.getUserId());
		}
		else {
			_log.info("Utente locale trovato: " + user.getUserId());
		}

		return user;
	}

	public RoleSoap[] getUserRoles(long remoteUserId) {

		try {
			return getRoleService().getUserRoles(remoteUserId);
		}
		catch (IOException | ServiceException e) {
			return new RoleSoap[0];
		}
	}

	public Map<Long, List<MBMessageSoap>> initBlogDiscussions(
		long remoteCompanyId, boolean includeAnonymous) {

		Map<Long, List<MBMessageSoap>> map =
			new HashMap<Long, List<MBMessageSoap>>();

		MBMessageSoap[] allMessages = getMBMessages();

		for (MBMessageSoap mbMessageSoap : allMessages) {
			if (mbMessageSoap.getCompanyId() != remoteCompanyId ||
				mbMessageSoap.getClassNameId() != remoteClassNameId ||
				mbMessageSoap.getClassPK() == 0 ||
				(!includeAnonymous && mbMessageSoap.isAnonymous()))
				continue;

			if (!map.containsKey(mbMessageSoap.getClassPK()))
				map.put(
					mbMessageSoap.getClassPK(), new ArrayList<MBMessageSoap>());

			List<MBMessageSoap> list = map.get(mbMessageSoap.getClassPK());
			if (list == null)
				list = new ArrayList<MBMessageSoap>();
			list.add(mbMessageSoap);
		}

		return map;
	}

	private BlogsEntryServiceSoap getBlogsEntryService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(
				getWSBaseUri() +
					blogsEntryLocator.getPortlet_Blogs_BlogsEntryServiceWSDDServiceName());
		Portlet_Blogs_BlogsEntryServiceSoapBindingStub service =
			(Portlet_Blogs_BlogsEntryServiceSoapBindingStub) blogsEntryLocator.getPortlet_Blogs_BlogsEntryService(portAddress);
		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	private ClassNameServiceSoap getClassNameService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(getWSBaseUri() +
				classNameLocator.getPortal_ClassNameServiceWSDDServiceName());
		Portal_ClassNameServiceSoapBindingStub service =
			(Portal_ClassNameServiceSoapBindingStub) classNameLocator.getPortal_ClassNameService(portAddress);
		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	private CompanyServiceSoap getCompanyService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(getWSBaseUri() +
				companyLocator.getPortal_CompanyServiceWSDDServiceName());
		Portal_CompanyServiceSoapBindingStub service =
			(Portal_CompanyServiceSoapBindingStub) companyLocator.getPortal_CompanyService(portAddress);
		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	private GroupServiceSoap getGroupService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(getWSBaseUri() +
				groupLocator.getPortal_GroupServiceWSDDServiceName());
		Portal_GroupServiceSoapBindingStub service =
			(Portal_GroupServiceSoapBindingStub) groupLocator.getPortal_GroupService(portAddress);

		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	private MBMessageServiceSoap getMBMessageService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(
				getWSBaseUri() +
					mbMessageLocator.getPortlet_MB_MBMessageServiceWSDDServiceName());
		Portlet_MB_MBMessageServiceSoapBindingStub service =
			(Portlet_MB_MBMessageServiceSoapBindingStub) mbMessageLocator.getPortlet_MB_MBMessageService(portAddress);

		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	private RoleServiceSoap getRoleService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(getWSBaseUri() +
				roleLocator.getPortal_RoleServiceWSDDServiceName());
		Portal_RoleServiceSoapBindingStub service =
			(Portal_RoleServiceSoapBindingStub) roleLocator.getPortal_RoleService(portAddress);

		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	@SuppressWarnings("unchecked")
	private MBMessage getRootMessage(long groupId, long entryId, long threadId)
		throws SystemException {

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(MBMessage.class);
		query.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		query.add(PropertyFactoryUtil.forName("classNameId").eq(
			PortalUtil.getClassNameId(BlogsEntry.class)));
		query.add(PropertyFactoryUtil.forName("classPK").eq(entryId));
		query.add(PropertyFactoryUtil.forName("parentMessageId").eq(0L));
		query.add(PropertyFactoryUtil.forName("subject").eq(
			String.valueOf(entryId)));
		query.add(PropertyFactoryUtil.forName("body").eq(
			String.valueOf(entryId)));

		List<MBMessage> list =
			MBMessageLocalServiceUtil.dynamicQuery(query, 0, 1);
		if (list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	private TagsEntryServiceSoap getTagsEntryService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(
				getWSBaseUri() +
					tagsEntryLocator.getPortlet_Tags_TagsEntryServiceWSDDServiceName());
		Portlet_Tags_TagsEntryServiceSoapBindingStub service =
			(Portlet_Tags_TagsEntryServiceSoapBindingStub) tagsEntryLocator.getPortlet_Tags_TagsEntryService(portAddress);

		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	private UserServiceSoap getUserService()
		throws MalformedURLException, ServiceException {

		URL portAddress =
			new URL(getWSBaseUri() +
				userLocator.getPortal_UserServiceWSDDServiceName());
		Portal_UserServiceSoapBindingStub service =
			(Portal_UserServiceSoapBindingStub) userLocator.getPortal_UserService(portAddress);

		service.setUsername(username);
		service.setPassword(password);

		return service;
	}

	private String getWSBaseUri() {

		return remoteBaseUri + "/tunnel-web/secure/axis/";
	}
}

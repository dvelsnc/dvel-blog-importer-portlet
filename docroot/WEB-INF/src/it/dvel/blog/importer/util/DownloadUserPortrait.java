
package it.dvel.blog.importer.util;

import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * Scarica l'immagine dell'utente dal sito remoto utilizzando la seguente
 * sintassi standard di portale:
 * <code>http://VIRTUALHOST/image/user_male_portrait
 * ?img_id=IMAGEID&t=TIMESTAMP</code>
 * 
 * @author Marco Napolitano, D'vel snc
 */
public class DownloadUserPortrait extends Thread {

	private final String remoteBaseUri;
	private final long remotePortraitId;
	private final long userId;

	/**
	 * Costruttore della classe
	 * 
	 * @param userId
	 *            Identificativo dell'utente
	 * @param remoteBaseUri
	 *            URI base dei link, ad es. <code>http://domain.com</code>
	 * @param remotePortraitId
	 *            Identificativo dell'immagine dell'utente
	 */
	public DownloadUserPortrait(
		long userId, String remoteBaseUri, long remotePortraitId) {

		this.userId = userId;
		this.remoteBaseUri = remoteBaseUri;
		this.remotePortraitId = remotePortraitId;
	}

	@Override
	public void run() {

		if (remotePortraitId > 0) {
			try {
				String portraitURL =
					remoteBaseUri + "/image/user_male_portrait?img_id=" +
						remotePortraitId + "&t=" + System.currentTimeMillis();

				byte[] bytes = HttpUtil.URLtoByteArray(portraitURL);

				UserLocalServiceUtil.updatePortrait(userId, bytes);
			}
			catch (Exception e) {
			}
		}
	}
}

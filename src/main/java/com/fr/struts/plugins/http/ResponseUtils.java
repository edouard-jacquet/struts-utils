package com.fr.struts.plugins.http;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

public final class ResponseUtils {

	private ResponseUtils() {

	}

	/**
	 * Récupère la réponse HTTP.
	 *
	 * @return le réponse.
	 */
	public static HttpServletResponse get() {
		return ServletActionContext.getResponse();
	}

	/**
	 * Défini le statut de la réponse HTTP.
	 *
	 * @param statut le statut de la réponse.
	 */
	public static void setStatus(int status) {
		ResponseUtils.get().setStatus(status);
	}

	/**
	 * Défini l'encodage de la réponse HTTP.
	 *
	 * @param charset l'encodage des caractères utilisés.
	 */
	public static void setCharacterEncoding(String charset) {
		ResponseUtils.get().setCharacterEncoding(charset);
	}

	/**
	 * Défini le type de contenu de la réponse HTTP.
	 *
	 * @param type le type du contenu utilisé.
	 */
	public static void setContentType(String type) {
		ResponseUtils.get().setContentType(type);
	}

}

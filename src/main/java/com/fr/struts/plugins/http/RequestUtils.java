package com.fr.struts.plugins.http;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public final class RequestUtils {

	private RequestUtils() {

	}

	/**
	 * Récupère la requête HTTP.
	 *
	 * @return le requête.
	 */
	public static HttpServletRequest get() {
		return ServletActionContext.getRequest();
	}

	/**
	 * Récupère une variable dans la requête HTTP.
	 *
	 * @param name le nom de la variable.
	 * @return la valeur de la variable.
	 */
	public static Object get(String name) {
		return RequestUtils.get().getAttribute(name);
	}

	/**
	 * Met à jour une variable dans la requête HTTP.
	 *
	 * @param name  le nom de la variable.
	 * @param value la valeur de la variable.
	 */
	public static void set(String name, Object value) {
		RequestUtils.get().setAttribute(name, value);
	}

	/**
	 * Détruit une variable dans la requête HTTP.
	 *
	 * @param name le nom de la variable.
	 */
	public static void destroy(String name) {
		RequestUtils.get().removeAttribute(name);
	}

	/**
	 * Récupère un paramètre dans la requête HTTP.
	 *
	 * @param name le nom du paramètre.
	 * @return la valeur du paramètre.
	 */
	public static String getParameter(String name) {
		return RequestUtils.get().getParameter(name);
	}

}
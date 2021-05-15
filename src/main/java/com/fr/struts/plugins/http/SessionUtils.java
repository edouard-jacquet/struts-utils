package com.fr.struts.plugins.http;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public final class SessionUtils {

	private SessionUtils() {

	}

	/**
	 * Récupère le tableau de variables contenu en session.
	 * 
	 * @return le tableau de variables.
	 */
	public static Map<String, Object> get() {
		return ActionContext.getContext().getSession();
	}

	/**
	 * Récupère une variable en session.
	 * 
	 * @param name le nom de la variable.
	 * @return la valeur de la variable.
	 */
	public static Object get(String name) {
		return SessionUtils.get().get(name);
	}

	/**
	 * Met à jour une variable en session.
	 * 
	 * @param name  le nom de la variable.
	 * @param value la valeur de la variable.
	 */
	public static void set(String name, Object value) {
		SessionUtils.get().put(name, value);
	}

	/**
	 * Détruit une variable en session.
	 * 
	 * @param name le nom de la variable.
	 */
	public static void destroy(String name) {
		SessionUtils.get().remove(name);
	}

}
package com.gdou.car.common.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

	public static String getCookieValue(HttpServletRequest request, String key) {
		Cookie[] cookies = request.getCookies();
		if (ArrayUtils.isNotEmpty(cookies)) {
			for (Cookie cookie : cookies) {
				if (StringUtils.equals(cookie.getName(), key)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}


	public static Cookie genCookieWithDomain(String key, String value, int maxAge, String domain){
		Cookie cookie = new Cookie(key, value);
		enrichCookie(cookie, "/", maxAge, domain);
		return cookie;
	}

	public static Cookie genCookie(String key, String value, String uri, int maxAge, String domain){
		Cookie cookie = new Cookie(key, value);
		enrichCookie(cookie, uri, maxAge, domain);
		return cookie;
	}

	public static void enrichCookie(Cookie cookie, String uri, int maxAge, String domain){
		cookie.setPath(uri);
		cookie.setMaxAge(maxAge);
		cookie.setDomain(domain);
	}

	public static void setCookie(HttpServletResponse response, Cookie cookie){
		response.addCookie(cookie);
	}

	// 判断request是否是ajax请求
	public static boolean isAjax(HttpServletRequest request){
		boolean isAjaxRequest = false;
		String requestedWith = request.getHeader("x-requested-with");
		if(!StringUtils.isBlank(requestedWith) && requestedWith.equalsIgnoreCase("XMLHttpRequest")){
			isAjaxRequest = true;
		}
		return isAjaxRequest;
	}
}
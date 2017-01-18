package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_rfc2109Version0Old {
	public static void main(String[] args) {
		try {
			new TestCookies().rfc2109Version0Old();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
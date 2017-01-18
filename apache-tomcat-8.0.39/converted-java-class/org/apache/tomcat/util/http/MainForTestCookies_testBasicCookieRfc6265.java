package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testBasicCookieRfc6265 {
	public static void main(String[] args) {
		try {
			new TestCookies().testBasicCookieRfc6265();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
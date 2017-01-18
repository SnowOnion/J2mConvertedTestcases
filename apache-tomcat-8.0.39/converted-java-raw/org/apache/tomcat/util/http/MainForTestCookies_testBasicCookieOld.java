package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testBasicCookieOld {
	public static void main(String[] args) {
		try {
			new TestCookies().testBasicCookieOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
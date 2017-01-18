package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1PathAffectsPrecedingCookieOld {
	public static void main(String[] args) {
		try {
			new TestCookies().v1PathAffectsPrecedingCookieOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
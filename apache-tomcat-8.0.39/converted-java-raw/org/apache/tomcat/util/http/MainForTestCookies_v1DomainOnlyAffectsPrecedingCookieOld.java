package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1DomainOnlyAffectsPrecedingCookieOld {
	public static void main(String[] args) {
		try {
			new TestCookies().v1DomainOnlyAffectsPrecedingCookieOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
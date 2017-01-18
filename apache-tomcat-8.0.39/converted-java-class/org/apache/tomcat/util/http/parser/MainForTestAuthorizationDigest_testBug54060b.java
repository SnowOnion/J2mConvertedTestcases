package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testBug54060b {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testBug54060b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
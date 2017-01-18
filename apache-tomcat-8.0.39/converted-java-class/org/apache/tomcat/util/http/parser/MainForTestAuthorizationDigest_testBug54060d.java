package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testBug54060d {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testBug54060d();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
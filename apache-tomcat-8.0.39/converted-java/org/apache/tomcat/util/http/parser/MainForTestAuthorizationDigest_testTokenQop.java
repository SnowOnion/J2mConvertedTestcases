package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testTokenQop {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testTokenQop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
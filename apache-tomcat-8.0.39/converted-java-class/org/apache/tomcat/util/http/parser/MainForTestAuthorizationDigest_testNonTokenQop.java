package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testNonTokenQop {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testNonTokenQop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testQuotedTokenQop {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testQuotedTokenQop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
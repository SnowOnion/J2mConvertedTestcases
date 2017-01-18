package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testQuotedNonTokenQop {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testQuotedNonTokenQop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
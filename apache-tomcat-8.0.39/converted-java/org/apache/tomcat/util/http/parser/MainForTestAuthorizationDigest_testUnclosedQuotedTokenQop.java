package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testUnclosedQuotedTokenQop {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testUnclosedQuotedTokenQop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
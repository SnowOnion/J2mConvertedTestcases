package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testUnclosedQuotedLhex {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testUnclosedQuotedLhex();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
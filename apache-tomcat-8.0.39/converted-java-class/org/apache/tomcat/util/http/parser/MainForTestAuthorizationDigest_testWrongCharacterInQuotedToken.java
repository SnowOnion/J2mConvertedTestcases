package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testWrongCharacterInQuotedToken {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testWrongCharacterInQuotedToken();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
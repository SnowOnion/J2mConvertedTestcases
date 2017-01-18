package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testWrongCharacterInToken {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testWrongCharacterInToken();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testWrongCharacterInHex {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testWrongCharacterInHex();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
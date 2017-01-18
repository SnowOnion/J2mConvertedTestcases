package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestAuthorizationDigest;

public class MainForTestAuthorizationDigest_testWrongCharacterInToken2 {
	public static void main(String[] args) {
		try {
			new TestAuthorizationDigest().testWrongCharacterInToken2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
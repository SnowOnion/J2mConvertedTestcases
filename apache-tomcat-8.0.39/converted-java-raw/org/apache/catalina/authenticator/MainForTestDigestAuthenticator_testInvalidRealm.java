package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidRealm {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidRealm();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidNonce {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
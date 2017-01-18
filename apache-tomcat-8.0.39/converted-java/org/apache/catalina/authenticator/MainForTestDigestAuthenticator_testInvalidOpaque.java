package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidOpaque {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidOpaque();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
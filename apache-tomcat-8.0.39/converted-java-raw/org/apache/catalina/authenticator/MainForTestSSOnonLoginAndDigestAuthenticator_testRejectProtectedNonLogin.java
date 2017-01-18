package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testRejectProtectedNonLogin {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndDigestAuthenticator().testRejectProtectedNonLogin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
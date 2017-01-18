package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testDigestExpiredAcceptProtectedWithCookies {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndDigestAuthenticator().testDigestExpiredAcceptProtectedWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
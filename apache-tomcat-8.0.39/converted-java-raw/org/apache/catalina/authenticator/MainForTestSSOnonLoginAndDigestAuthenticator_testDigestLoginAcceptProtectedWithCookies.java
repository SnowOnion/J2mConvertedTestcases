package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testDigestLoginAcceptProtectedWithCookies {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndDigestAuthenticator().testDigestLoginAcceptProtectedWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
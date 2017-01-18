package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testDigestLoginRejectProtectedWithoutCookies {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndDigestAuthenticator().testDigestLoginRejectProtectedWithoutCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndDigestAuthenticator;

public class MainForTestSSOnonLoginAndDigestAuthenticator_testDigestLoginSessionTimeout {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndDigestAuthenticator().testDigestLoginSessionTimeout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
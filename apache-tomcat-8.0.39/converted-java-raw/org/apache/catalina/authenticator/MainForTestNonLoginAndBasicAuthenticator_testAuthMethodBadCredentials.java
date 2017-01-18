package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testAuthMethodBadCredentials {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testAuthMethodBadCredentials();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
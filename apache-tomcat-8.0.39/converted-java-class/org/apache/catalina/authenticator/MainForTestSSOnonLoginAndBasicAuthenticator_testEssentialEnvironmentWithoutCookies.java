package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testEssentialEnvironmentWithoutCookies {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndBasicAuthenticator().testEssentialEnvironmentWithoutCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
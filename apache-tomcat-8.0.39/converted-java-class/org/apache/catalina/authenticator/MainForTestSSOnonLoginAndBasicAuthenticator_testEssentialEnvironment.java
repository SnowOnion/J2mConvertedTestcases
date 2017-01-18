package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testEssentialEnvironment {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndBasicAuthenticator().testEssentialEnvironment();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
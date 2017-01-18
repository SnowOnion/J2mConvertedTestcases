package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicAccessAndSessionTimeout {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndBasicAuthenticator().testBasicAccessAndSessionTimeout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
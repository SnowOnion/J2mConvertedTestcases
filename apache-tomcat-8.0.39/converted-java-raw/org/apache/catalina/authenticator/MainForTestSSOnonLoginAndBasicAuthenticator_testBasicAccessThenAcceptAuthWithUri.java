package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicAccessThenAcceptAuthWithUri {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndBasicAuthenticator().testBasicAccessThenAcceptAuthWithUri();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
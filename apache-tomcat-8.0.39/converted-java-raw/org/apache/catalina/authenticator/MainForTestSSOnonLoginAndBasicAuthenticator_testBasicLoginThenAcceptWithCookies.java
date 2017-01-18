package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicLoginThenAcceptWithCookies {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndBasicAuthenticator().testBasicLoginThenAcceptWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicLoginThenRejectWithoutCookie {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndBasicAuthenticator().testBasicLoginThenRejectWithoutCookie();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
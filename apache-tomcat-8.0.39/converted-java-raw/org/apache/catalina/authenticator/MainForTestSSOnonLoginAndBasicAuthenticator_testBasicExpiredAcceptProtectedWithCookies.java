package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestSSOnonLoginAndBasicAuthenticator;

public class MainForTestSSOnonLoginAndBasicAuthenticator_testBasicExpiredAcceptProtectedWithCookies {
	public static void main(String[] args) {
		try {
			new TestSSOnonLoginAndBasicAuthenticator().testBasicExpiredAcceptProtectedWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
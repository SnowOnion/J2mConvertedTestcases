package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testRejectProtectedNonLogin {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testRejectProtectedNonLogin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
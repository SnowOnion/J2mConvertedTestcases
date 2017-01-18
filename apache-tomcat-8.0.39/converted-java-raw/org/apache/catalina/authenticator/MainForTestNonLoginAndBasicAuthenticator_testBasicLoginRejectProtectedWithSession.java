package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testBasicLoginRejectProtectedWithSession {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testBasicLoginRejectProtectedWithSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
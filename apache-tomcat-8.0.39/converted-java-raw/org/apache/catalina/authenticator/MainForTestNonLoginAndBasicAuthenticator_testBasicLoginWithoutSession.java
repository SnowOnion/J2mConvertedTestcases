package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testBasicLoginWithoutSession {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testBasicLoginWithoutSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
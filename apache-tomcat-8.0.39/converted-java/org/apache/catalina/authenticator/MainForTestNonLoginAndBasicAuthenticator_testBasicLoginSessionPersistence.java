package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testBasicLoginSessionPersistence {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testBasicLoginSessionPersistence();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
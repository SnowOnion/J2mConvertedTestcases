package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testBasicLoginSessionTimeout {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testBasicLoginSessionTimeout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
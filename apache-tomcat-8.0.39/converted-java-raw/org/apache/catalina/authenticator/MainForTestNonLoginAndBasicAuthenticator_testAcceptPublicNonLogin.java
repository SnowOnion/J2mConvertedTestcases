package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testAcceptPublicNonLogin {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testAcceptPublicNonLogin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testAcceptProtectedBasic {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testAcceptProtectedBasic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testAcceptPublicBasic {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testAcceptPublicBasic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
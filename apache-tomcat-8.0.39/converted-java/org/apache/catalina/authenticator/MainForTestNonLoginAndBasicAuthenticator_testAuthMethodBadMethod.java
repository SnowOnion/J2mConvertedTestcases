package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testAuthMethodBadMethod {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testAuthMethodBadMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
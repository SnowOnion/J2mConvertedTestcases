package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testAuthMethodCaseBasic {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testAuthMethodCaseBasic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
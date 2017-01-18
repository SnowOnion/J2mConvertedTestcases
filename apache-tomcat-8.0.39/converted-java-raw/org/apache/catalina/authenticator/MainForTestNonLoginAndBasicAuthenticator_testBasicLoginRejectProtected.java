package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestNonLoginAndBasicAuthenticator;

public class MainForTestNonLoginAndBasicAuthenticator_testBasicLoginRejectProtected {
	public static void main(String[] args) {
		try {
			new TestNonLoginAndBasicAuthenticator().testBasicLoginRejectProtected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostNoContinuePostRedirectNoClientCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostNoContinuePostRedirectNoClientCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
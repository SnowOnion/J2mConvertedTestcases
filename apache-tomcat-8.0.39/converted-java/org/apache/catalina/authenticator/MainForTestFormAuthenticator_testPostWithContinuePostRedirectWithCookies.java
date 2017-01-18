package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostWithContinuePostRedirectWithCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostWithContinuePostRedirectWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostWithContinuePostRedirectNoServerCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostWithContinuePostRedirectNoServerCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
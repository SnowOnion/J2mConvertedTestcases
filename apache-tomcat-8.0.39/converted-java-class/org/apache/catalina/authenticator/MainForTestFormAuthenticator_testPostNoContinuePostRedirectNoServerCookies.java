package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostNoContinuePostRedirectNoServerCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostNoContinuePostRedirectNoServerCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
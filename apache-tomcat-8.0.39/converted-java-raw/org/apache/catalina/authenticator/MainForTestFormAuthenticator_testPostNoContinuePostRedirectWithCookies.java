package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostNoContinuePostRedirectWithCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostNoContinuePostRedirectWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
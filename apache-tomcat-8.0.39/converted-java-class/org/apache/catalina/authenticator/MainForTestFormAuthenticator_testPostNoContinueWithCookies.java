package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostNoContinueWithCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostNoContinueWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
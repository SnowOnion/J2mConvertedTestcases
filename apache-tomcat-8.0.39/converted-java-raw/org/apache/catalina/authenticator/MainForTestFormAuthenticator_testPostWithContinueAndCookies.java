package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostWithContinueAndCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostWithContinueAndCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
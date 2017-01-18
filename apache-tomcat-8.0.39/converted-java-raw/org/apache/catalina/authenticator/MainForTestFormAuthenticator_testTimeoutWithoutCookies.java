package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testTimeoutWithoutCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testTimeoutWithoutCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
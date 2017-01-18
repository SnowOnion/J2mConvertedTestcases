package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testNoChangedSessidWithoutCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testNoChangedSessidWithoutCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
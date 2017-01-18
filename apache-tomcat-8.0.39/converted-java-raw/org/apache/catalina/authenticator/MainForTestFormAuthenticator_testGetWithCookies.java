package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testGetWithCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testGetWithCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testGetNoClientCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testGetNoClientCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
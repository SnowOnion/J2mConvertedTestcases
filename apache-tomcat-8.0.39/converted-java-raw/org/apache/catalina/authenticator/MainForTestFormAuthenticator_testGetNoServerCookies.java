package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testGetNoServerCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testGetNoServerCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
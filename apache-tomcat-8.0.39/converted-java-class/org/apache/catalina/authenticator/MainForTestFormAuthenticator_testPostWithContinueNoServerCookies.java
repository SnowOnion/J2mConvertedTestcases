package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostWithContinueNoServerCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostWithContinueNoServerCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
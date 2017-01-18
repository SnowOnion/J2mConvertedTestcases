package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostWithContinueNoClientCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostWithContinueNoClientCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
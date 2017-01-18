package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostNoContinueNoClientCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostNoContinueNoClientCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
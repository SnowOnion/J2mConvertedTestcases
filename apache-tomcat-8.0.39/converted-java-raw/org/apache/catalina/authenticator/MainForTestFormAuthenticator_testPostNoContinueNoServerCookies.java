package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_testPostNoContinueNoServerCookies {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().testPostNoContinueNoServerCookies();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
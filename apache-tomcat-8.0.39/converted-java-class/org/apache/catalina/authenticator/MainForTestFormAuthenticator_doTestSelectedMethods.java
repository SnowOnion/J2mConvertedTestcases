package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestFormAuthenticator;

public class MainForTestFormAuthenticator_doTestSelectedMethods {
	public static void main(String[] args) {
		try {
			new TestFormAuthenticator().doTestSelectedMethods();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
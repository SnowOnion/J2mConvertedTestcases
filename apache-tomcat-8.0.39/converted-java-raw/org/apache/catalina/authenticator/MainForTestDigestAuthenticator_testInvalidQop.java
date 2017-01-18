package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidQop {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidQop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
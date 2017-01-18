package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidUriFail {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidUriFail();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
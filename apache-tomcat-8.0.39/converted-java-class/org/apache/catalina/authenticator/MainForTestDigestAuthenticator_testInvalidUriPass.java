package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidUriPass {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidUriPass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
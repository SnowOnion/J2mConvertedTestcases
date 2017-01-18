package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testAllValid {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testAllValid();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testReplay {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testReplay();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
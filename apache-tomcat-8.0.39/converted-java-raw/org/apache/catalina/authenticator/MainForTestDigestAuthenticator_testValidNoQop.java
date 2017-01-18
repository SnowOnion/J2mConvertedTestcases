package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testValidNoQop {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testValidNoQop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
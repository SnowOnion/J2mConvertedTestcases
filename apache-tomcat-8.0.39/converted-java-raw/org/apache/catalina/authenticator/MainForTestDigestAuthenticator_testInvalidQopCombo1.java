package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidQopCombo1 {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidQopCombo1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidQopCombo4 {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidQopCombo4();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
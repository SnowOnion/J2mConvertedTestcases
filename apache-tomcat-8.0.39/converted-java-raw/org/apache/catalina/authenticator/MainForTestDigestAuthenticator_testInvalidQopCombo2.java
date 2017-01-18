package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testInvalidQopCombo2 {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testInvalidQopCombo2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_bug54521 {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().bug54521();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
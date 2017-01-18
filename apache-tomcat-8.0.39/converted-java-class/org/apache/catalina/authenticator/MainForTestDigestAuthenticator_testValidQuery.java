package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TestDigestAuthenticator;

public class MainForTestDigestAuthenticator_testValidQuery {
	public static void main(String[] args) {
		try {
			new TestDigestAuthenticator().testValidQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
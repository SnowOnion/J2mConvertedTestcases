package org.apache.catalina.authenticator;

import org.apache.catalina.authenticator.TesterDigestAuthenticatorPerformance;

public class MainForTesterDigestAuthenticatorPerformance_testSimple {
	public static void main(String[] args) {
		try {
			new TesterDigestAuthenticatorPerformance().testSimple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
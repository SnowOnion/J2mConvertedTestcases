package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetDomainNotInitPhase {
	public static void main(String[] args) {
		try {
			new TestApplicationSessionCookieConfig().testSetDomainNotInitPhase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
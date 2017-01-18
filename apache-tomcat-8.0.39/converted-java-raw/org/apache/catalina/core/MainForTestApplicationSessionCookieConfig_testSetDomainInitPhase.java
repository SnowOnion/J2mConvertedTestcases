package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetDomainInitPhase {
	public static void main(String[] args) {
		try {
			new TestApplicationSessionCookieConfig().testSetDomainInitPhase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetMaxAgeInitPhase {
	public static void main(String[] args) {
		try {
			new TestApplicationSessionCookieConfig().testSetMaxAgeInitPhase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
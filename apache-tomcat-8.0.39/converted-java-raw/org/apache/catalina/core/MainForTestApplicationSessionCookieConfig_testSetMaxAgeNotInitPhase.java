package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetMaxAgeNotInitPhase {
	public static void main(String[] args) {
		try {
			new TestApplicationSessionCookieConfig().testSetMaxAgeNotInitPhase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
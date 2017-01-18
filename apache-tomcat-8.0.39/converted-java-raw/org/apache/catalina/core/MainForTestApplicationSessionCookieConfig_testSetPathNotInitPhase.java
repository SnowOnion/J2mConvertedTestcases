package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationSessionCookieConfig;

public class MainForTestApplicationSessionCookieConfig_testSetPathNotInitPhase {
	public static void main(String[] args) {
		try {
			new TestApplicationSessionCookieConfig().testSetPathNotInitPhase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.security;

import org.apache.catalina.security.TestSecurityClassLoad;

public class MainForTestSecurityClassLoad_testLoad {
	public static void main(String[] args) {
		try {
			new TestSecurityClassLoad().testLoad();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testEnableNamingGlobal {
	public static void main(String[] args) {
		try {
			new TestTomcat().testEnableNamingGlobal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
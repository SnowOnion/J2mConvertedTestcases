package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testEnableNaming {
	public static void main(String[] args) {
		try {
			new TestTomcat().testEnableNaming();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
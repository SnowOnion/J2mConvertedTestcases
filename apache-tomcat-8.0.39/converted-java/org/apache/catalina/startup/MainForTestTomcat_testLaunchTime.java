package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testLaunchTime {
	public static void main(String[] args) {
		try {
			new TestTomcat().testLaunchTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
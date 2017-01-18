package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testProgrammatic {
	public static void main(String[] args) {
		try {
			new TestTomcat().testProgrammatic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
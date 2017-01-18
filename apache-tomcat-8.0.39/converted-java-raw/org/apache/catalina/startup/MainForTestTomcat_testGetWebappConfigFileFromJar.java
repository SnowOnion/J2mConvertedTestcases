package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetWebappConfigFileFromJar {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetWebappConfigFileFromJar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
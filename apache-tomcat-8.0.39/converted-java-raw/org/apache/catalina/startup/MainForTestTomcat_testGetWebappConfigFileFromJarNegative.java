package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetWebappConfigFileFromJarNegative {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetWebappConfigFileFromJarNegative();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
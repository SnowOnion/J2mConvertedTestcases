package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetWebappConfigFileFromDirectoryNegative {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetWebappConfigFileFromDirectoryNegative();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
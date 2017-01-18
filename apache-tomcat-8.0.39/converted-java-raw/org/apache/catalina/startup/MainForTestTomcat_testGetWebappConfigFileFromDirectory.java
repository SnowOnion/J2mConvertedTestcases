package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetWebappConfigFileFromDirectory {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetWebappConfigFileFromDirectory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetResource {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetResource();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
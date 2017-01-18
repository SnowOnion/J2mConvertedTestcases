package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testSingleWebapp {
	public static void main(String[] args) {
		try {
			new TestTomcat().testSingleWebapp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
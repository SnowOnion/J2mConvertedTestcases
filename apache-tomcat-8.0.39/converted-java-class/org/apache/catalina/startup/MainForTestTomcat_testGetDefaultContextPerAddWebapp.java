package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetDefaultContextPerAddWebapp {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetDefaultContextPerAddWebapp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
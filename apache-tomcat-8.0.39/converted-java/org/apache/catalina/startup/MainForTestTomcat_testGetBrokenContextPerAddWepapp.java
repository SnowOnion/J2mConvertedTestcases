package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetBrokenContextPerAddWepapp {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetBrokenContextPerAddWepapp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
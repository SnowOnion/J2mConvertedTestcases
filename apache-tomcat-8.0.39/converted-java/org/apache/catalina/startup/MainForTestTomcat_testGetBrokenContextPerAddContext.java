package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetBrokenContextPerAddContext {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetBrokenContextPerAddContext();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
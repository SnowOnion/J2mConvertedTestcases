package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetDefaultContextPerAddContext {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetDefaultContextPerAddContext();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
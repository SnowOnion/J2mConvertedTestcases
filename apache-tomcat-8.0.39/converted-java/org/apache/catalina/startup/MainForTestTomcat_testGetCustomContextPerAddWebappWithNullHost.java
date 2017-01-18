package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetCustomContextPerAddWebappWithNullHost {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetCustomContextPerAddWebappWithNullHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
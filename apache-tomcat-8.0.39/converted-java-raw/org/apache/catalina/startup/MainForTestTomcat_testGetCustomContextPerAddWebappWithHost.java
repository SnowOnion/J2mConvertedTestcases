package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetCustomContextPerAddWebappWithHost {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetCustomContextPerAddWebappWithHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
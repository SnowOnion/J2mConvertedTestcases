package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testGetCustomContextPerAddContextWithHost {
	public static void main(String[] args) {
		try {
			new TestTomcat().testGetCustomContextPerAddContextWithHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
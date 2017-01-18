package org.apache.catalina.startup;

import org.apache.catalina.startup.TestTomcat;

public class MainForTestTomcat_testJsps {
	public static void main(String[] args) {
		try {
			new TestTomcat().testJsps();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
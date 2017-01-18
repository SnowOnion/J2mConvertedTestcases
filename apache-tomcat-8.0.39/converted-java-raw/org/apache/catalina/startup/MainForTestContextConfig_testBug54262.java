package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testBug54262 {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testBug54262();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
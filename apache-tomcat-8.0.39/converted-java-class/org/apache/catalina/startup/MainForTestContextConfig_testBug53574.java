package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testBug53574 {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testBug53574();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
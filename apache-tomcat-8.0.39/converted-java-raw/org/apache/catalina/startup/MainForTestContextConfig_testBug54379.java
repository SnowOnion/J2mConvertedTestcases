package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testBug54379 {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testBug54379();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
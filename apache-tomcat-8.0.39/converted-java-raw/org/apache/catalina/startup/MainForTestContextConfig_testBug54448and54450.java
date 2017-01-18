package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testBug54448and54450 {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testBug54448and54450();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
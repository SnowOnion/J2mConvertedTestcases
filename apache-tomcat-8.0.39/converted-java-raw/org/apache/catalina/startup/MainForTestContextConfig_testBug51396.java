package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testBug51396 {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testBug51396();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
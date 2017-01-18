package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testBug55210 {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testBug55210();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
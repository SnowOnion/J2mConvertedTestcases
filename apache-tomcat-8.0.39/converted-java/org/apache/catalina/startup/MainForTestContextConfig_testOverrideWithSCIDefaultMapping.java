package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testOverrideWithSCIDefaultMapping {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testOverrideWithSCIDefaultMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
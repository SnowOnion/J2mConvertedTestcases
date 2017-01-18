package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testOverrideWithSCIDefaultName {
	public static void main(String[] args) {
		try {
			new TestContextConfig().testOverrideWithSCIDefaultName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
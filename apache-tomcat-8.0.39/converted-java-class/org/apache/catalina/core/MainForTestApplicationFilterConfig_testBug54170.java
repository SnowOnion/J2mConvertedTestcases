package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationFilterConfig;

public class MainForTestApplicationFilterConfig_testBug54170 {
	public static void main(String[] args) {
		try {
			new TestApplicationFilterConfig().testBug54170();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
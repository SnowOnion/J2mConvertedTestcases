package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testSecurityAnnotationsNoWebXmlLoginConfig {
	public static void main(String[] args) {
		try {
			new TestStandardWrapper().testSecurityAnnotationsNoWebXmlLoginConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
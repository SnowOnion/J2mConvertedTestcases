package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testSecurityAnnotationsSubclass1 {
	public static void main(String[] args) {
		try {
			new TestStandardWrapper().testSecurityAnnotationsSubclass1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
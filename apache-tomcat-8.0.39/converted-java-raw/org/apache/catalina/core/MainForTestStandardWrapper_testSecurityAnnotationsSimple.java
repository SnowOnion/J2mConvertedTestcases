package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testSecurityAnnotationsSimple {
	public static void main(String[] args) {
		try {
			new TestStandardWrapper().testSecurityAnnotationsSimple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextValve;

public class MainForTestStandardContextValve_testBug51653b {
	public static void main(String[] args) {
		try {
			new TestStandardContextValve().testBug51653b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
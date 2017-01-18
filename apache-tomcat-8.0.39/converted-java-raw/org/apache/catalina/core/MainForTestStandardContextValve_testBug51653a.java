package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextValve;

public class MainForTestStandardContextValve_testBug51653a {
	public static void main(String[] args) {
		try {
			new TestStandardContextValve().testBug51653a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
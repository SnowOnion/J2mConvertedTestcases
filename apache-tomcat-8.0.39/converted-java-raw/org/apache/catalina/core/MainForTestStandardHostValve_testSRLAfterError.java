package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardHostValve;

public class MainForTestStandardHostValve_testSRLAfterError {
	public static void main(String[] args) {
		try {
			new TestStandardHostValve().testSRLAfterError();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
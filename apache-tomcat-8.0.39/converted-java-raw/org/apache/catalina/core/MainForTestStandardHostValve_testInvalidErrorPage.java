package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardHostValve;

public class MainForTestStandardHostValve_testInvalidErrorPage {
	public static void main(String[] args) {
		try {
			new TestStandardHostValve().testInvalidErrorPage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
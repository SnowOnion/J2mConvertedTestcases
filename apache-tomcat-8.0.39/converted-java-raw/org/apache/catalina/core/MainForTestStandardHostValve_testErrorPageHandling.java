package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardHostValve;

public class MainForTestStandardHostValve_testErrorPageHandling {
	public static void main(String[] args) {
		try {
			new TestStandardHostValve().testErrorPageHandling();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
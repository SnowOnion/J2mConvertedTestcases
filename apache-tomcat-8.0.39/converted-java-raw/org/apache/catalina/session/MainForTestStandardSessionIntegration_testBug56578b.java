package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSessionIntegration;

public class MainForTestStandardSessionIntegration_testBug56578b {
	public static void main(String[] args) {
		try {
			new TestStandardSessionIntegration().testBug56578b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
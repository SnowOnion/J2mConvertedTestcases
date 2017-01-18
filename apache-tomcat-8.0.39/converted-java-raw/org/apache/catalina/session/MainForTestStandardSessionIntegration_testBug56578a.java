package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSessionIntegration;

public class MainForTestStandardSessionIntegration_testBug56578a {
	public static void main(String[] args) {
		try {
			new TestStandardSessionIntegration().testBug56578a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
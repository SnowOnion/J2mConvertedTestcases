package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testDenyUncoveredHttpMethodsSCITrue {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testDenyUncoveredHttpMethodsSCITrue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
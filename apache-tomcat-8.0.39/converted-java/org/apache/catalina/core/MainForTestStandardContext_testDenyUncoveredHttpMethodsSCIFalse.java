package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testDenyUncoveredHttpMethodsSCIFalse {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testDenyUncoveredHttpMethodsSCIFalse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
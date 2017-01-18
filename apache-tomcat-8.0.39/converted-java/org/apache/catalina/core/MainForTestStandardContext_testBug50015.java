package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug50015 {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testBug50015();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
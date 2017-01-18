package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug57556b {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testBug57556b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
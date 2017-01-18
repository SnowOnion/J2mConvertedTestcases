package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug51376b {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testBug51376b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
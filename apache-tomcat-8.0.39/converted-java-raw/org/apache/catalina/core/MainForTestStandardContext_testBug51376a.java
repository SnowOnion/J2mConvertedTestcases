package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug51376a {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testBug51376a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testTldListener {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testTldListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
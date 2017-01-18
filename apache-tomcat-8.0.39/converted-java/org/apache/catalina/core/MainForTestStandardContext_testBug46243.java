package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug46243 {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testBug46243();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
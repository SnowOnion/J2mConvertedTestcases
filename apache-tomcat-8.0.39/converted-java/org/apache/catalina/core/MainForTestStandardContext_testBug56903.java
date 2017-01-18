package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug56903 {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testBug56903();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
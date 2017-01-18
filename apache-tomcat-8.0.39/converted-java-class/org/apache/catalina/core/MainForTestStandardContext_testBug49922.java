package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug49922 {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testBug49922();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
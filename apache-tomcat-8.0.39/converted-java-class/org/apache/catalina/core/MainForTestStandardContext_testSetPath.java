package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testSetPath {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testSetPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
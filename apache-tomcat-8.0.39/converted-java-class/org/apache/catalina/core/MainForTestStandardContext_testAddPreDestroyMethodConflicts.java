package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testAddPreDestroyMethodConflicts {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testAddPreDestroyMethodConflicts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
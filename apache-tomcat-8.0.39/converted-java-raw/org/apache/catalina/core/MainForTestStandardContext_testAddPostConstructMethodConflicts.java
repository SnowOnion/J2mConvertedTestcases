package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testAddPostConstructMethodConflicts {
	public static void main(String[] args) {
		try {
			new TestStandardContext().testAddPostConstructMethodConflicts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testJspPropertyGroupsAreIsolated {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testJspPropertyGroupsAreIsolated();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
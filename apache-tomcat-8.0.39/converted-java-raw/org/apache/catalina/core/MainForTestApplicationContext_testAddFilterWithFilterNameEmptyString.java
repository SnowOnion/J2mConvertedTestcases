package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testAddFilterWithFilterNameEmptyString {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testAddFilterWithFilterNameEmptyString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
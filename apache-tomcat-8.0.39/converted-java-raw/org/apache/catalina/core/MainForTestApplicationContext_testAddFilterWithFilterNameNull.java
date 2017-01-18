package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testAddFilterWithFilterNameNull {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testAddFilterWithFilterNameNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testBug57190 {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testBug57190();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
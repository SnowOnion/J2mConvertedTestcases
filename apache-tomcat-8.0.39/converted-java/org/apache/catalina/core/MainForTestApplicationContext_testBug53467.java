package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testBug53467 {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testBug53467();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testAddServletWithServletNameNull {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testAddServletWithServletNameNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
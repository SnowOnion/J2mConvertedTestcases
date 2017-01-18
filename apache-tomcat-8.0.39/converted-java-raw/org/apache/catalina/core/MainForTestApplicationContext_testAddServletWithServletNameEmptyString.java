package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testAddServletWithServletNameEmptyString {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testAddServletWithServletNameEmptyString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
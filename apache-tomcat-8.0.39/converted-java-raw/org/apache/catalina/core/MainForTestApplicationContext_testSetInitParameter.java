package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testSetInitParameter {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testSetInitParameter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
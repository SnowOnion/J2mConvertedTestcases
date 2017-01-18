package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testGetJspConfigDescriptor {
	public static void main(String[] args) {
		try {
			new TestApplicationContext().testGetJspConfigDescriptor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
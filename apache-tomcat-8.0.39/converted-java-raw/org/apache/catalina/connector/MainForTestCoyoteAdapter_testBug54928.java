package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testBug54928 {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testBug54928();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
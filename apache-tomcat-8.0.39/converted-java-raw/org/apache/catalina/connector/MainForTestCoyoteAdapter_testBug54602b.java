package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testBug54602b {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testBug54602b();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
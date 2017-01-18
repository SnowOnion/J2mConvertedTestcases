package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testBug54602d {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testBug54602d();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testBug54602a {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testBug54602a();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
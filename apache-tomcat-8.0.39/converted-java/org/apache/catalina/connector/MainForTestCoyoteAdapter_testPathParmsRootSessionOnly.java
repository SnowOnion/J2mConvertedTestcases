package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testPathParmsRootSessionOnly {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testPathParmsRootSessionOnly();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testPathParmsRootNone {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testPathParmsRootNone();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testPathParmsFooSessionOnly {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testPathParmsFooSessionOnly();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
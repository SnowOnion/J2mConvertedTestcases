package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testPathParamsRedirect {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testPathParamsRedirect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
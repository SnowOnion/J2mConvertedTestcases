package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteAdapter;

public class MainForTestCoyoteAdapter_testPathParamExtRootNoParam {
	public static void main(String[] args) {
		try {
			new TestCoyoteAdapter().testPathParamExtRootNoParam();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
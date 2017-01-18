package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckActualRequestTypeMethodPOSTNotSimpleHeaders {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckActualRequestTypeMethodPOSTNotSimpleHeaders();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
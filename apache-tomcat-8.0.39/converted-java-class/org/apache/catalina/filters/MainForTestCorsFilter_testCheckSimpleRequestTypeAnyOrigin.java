package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckSimpleRequestTypeAnyOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckSimpleRequestTypeAnyOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
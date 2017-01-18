package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckSimpleRequestType {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckSimpleRequestType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
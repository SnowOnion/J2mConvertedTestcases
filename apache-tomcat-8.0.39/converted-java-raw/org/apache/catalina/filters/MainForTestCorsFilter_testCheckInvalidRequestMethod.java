package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidRequestMethod {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckInvalidRequestMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
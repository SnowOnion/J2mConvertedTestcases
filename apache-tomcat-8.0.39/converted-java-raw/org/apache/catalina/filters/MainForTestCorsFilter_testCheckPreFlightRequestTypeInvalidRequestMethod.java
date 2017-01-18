package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeInvalidRequestMethod {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeInvalidRequestMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
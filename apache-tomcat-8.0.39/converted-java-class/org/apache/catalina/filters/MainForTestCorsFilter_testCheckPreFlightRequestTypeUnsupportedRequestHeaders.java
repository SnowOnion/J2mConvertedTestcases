package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeUnsupportedRequestHeaders {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeUnsupportedRequestHeaders();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
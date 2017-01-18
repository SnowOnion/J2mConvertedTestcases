package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeUnsupportedRequestMethod {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeUnsupportedRequestMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
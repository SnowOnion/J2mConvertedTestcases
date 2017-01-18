package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeOriginNotAllowed {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeOriginNotAllowed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
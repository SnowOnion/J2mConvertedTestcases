package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidOriginNotAllowedSubdomain {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckInvalidOriginNotAllowedSubdomain();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
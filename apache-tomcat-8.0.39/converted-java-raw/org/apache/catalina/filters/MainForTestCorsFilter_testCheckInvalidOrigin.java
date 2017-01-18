package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckInvalidOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeNoACRM {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeNoACRM();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
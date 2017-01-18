package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestType {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
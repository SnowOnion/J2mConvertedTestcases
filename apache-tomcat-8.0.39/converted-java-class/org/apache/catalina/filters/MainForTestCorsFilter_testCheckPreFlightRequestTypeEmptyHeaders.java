package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeEmptyHeaders {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeEmptyHeaders();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
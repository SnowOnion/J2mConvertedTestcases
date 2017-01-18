package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeEmptyACRM {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeEmptyACRM();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
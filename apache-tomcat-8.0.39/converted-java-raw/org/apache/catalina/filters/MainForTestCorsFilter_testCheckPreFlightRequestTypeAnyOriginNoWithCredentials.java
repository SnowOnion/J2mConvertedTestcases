package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeAnyOriginNoWithCredentials {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckPreFlightRequestTypeAnyOriginNoWithCredentials();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
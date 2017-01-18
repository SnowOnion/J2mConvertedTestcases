package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightWithCredentials {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterPreflightWithCredentials();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
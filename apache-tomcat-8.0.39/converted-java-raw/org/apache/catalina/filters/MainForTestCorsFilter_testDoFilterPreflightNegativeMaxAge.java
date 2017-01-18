package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightNegativeMaxAge {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterPreflightNegativeMaxAge();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
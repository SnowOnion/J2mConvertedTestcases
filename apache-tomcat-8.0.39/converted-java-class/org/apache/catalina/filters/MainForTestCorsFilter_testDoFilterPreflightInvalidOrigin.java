package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightInvalidOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterPreflightInvalidOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
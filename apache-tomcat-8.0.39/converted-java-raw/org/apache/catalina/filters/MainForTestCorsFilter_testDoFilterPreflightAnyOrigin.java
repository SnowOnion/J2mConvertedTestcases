package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightAnyOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterPreflightAnyOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
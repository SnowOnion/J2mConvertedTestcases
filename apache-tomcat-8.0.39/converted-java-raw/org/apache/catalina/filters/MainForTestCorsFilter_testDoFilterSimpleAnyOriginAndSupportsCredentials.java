package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleAnyOriginAndSupportsCredentials {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSimpleAnyOriginAndSupportsCredentials();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
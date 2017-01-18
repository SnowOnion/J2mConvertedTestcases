package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleAnyOriginAndSupportsCredentialsDisabled {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSimpleAnyOriginAndSupportsCredentialsDisabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
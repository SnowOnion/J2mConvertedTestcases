package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleWithExposedHeaders {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSimpleWithExposedHeaders();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
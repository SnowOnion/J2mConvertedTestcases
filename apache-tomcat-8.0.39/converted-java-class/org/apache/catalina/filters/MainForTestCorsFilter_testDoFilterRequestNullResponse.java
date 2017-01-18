package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterRequestNullResponse {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterRequestNullResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
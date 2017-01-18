package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterNullOriginAllowedByConfiguration {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterNullOriginAllowedByConfiguration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflightWithoutCredentialsAndSpecificOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterPreflightWithoutCredentialsAndSpecificOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
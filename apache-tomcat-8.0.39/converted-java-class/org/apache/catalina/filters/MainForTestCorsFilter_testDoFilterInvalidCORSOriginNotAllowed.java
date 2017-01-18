package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterInvalidCORSOriginNotAllowed {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterInvalidCORSOriginNotAllowed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
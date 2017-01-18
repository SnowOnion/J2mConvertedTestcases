package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckNullOriginNotAllowed {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckNullOriginNotAllowed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
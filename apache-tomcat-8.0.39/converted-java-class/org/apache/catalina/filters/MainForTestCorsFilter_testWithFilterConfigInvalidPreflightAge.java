package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testWithFilterConfigInvalidPreflightAge {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testWithFilterConfigInvalidPreflightAge();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
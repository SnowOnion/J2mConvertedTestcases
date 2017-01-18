package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInitInvalidFilterConfig {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testInitInvalidFilterConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
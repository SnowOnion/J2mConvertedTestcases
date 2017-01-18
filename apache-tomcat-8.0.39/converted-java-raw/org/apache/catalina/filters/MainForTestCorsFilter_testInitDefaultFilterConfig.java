package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInitDefaultFilterConfig {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testInitDefaultFilterConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
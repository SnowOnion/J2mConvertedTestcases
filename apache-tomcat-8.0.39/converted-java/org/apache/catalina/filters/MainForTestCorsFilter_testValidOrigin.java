package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testValidOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testValidOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckRequestTypeNull {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckRequestTypeNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
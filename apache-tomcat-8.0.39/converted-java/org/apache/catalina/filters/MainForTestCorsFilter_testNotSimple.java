package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testNotSimple {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testNotSimple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testNotPreflight {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testNotPreflight();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
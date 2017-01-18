package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinAllNullElements {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoinAllNullElements();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
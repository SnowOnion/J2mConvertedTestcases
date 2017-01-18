package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinAllEmptyElements {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoinAllEmptyElements();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
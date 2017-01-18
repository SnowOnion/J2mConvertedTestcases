package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
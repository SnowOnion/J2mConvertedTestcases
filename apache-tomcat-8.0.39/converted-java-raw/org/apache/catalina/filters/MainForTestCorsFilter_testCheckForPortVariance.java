package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckForPortVariance {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckForPortVariance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
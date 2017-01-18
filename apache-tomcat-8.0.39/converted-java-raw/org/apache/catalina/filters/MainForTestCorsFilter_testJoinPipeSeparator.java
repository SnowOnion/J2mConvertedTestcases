package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinPipeSeparator {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoinPipeSeparator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
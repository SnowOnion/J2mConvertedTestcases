package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinSingleElement {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoinSingleElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
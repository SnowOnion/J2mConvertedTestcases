package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinOneNullElement {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoinOneNullElement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
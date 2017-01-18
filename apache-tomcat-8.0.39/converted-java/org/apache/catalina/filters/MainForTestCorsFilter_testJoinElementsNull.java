package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinElementsNull {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoinElementsNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
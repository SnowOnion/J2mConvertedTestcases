package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterPreflight {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterPreflight();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
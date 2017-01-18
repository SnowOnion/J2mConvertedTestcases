package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSameHostWithOrigin01 {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSameHostWithOrigin01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
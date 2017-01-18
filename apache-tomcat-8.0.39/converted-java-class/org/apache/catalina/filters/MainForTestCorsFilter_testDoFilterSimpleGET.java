package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleGET {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSimpleGET();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
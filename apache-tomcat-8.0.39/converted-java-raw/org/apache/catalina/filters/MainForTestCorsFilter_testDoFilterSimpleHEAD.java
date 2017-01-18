package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleHEAD {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSimpleHEAD();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
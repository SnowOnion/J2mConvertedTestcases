package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimplePOST {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSimplePOST();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterSimpleSpecificHeader {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterSimpleSpecificHeader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
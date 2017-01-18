package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testAddNonceQueryAnchor {
	public static void main(String[] args) {
		try {
			new TestCsrfPreventionFilter().testAddNonceQueryAnchor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
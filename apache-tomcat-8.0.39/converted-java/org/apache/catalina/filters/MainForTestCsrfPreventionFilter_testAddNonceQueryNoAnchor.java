package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testAddNonceQueryNoAnchor {
	public static void main(String[] args) {
		try {
			new TestCsrfPreventionFilter().testAddNonceQueryNoAnchor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
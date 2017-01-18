package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testAddNonceNoQueryAnchor {
	public static void main(String[] args) {
		try {
			new TestCsrfPreventionFilter().testAddNonceNoQueryAnchor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
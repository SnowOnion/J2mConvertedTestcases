package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testAddNonceNoQueryNoAnchor {
	public static void main(String[] args) {
		try {
			new TestCsrfPreventionFilter().testAddNonceNoQueryNoAnchor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
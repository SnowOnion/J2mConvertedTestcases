package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestInvalidNonceAsParameterValidPath {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestInvalidNonceAsParameterValidPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
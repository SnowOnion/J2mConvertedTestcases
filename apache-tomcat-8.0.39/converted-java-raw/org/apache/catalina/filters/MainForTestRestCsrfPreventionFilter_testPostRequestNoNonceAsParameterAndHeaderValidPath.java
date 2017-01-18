package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestNoNonceAsParameterAndHeaderValidPath {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestNoNonceAsParameterAndHeaderValidPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
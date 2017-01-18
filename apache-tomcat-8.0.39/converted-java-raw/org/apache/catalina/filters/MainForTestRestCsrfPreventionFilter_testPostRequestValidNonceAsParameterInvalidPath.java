package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestValidNonceAsParameterInvalidPath {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestValidNonceAsParameterInvalidPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
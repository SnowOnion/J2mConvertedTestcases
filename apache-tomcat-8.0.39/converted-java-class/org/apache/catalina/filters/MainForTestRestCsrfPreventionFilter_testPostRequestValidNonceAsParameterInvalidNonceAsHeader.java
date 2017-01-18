package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestValidNonceAsParameterInvalidNonceAsHeader {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestValidNonceAsParameterInvalidNonceAsHeader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
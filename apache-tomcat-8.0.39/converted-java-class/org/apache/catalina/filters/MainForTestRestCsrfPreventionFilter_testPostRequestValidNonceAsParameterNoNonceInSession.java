package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestValidNonceAsParameterNoNonceInSession {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestValidNonceAsParameterNoNonceInSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
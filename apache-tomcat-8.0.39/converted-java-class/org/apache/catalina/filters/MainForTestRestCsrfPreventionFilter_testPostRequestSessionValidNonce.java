package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestSessionValidNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestSessionValidNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestSessionInvalidNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestSessionInvalidNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
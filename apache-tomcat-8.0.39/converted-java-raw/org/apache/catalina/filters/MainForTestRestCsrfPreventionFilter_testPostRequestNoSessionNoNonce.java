package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestNoSessionNoNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestNoSessionNoNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
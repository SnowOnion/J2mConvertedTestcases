package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testGetRequestNoSessionNoNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testGetRequestNoSessionNoNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
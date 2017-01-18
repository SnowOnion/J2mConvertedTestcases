package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestSessionNoNonce1 {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestSessionNoNonce1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostFetchRequestSessionNoNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostFetchRequestSessionNoNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
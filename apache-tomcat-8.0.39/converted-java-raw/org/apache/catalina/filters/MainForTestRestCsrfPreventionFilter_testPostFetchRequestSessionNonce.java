package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostFetchRequestSessionNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostFetchRequestSessionNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
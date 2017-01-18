package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testGetFetchRequestSessionNoNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testGetFetchRequestSessionNoNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
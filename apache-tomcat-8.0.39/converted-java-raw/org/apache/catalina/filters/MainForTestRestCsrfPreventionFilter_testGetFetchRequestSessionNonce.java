package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testGetFetchRequestSessionNonce {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testGetFetchRequestSessionNonce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
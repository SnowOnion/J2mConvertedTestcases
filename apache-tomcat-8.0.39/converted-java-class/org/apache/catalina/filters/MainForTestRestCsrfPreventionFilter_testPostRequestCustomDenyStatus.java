package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestCustomDenyStatus {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestCustomDenyStatus();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
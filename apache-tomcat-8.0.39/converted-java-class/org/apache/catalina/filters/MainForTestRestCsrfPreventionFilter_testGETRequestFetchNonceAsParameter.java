package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testGETRequestFetchNonceAsParameter {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testGETRequestFetchNonceAsParameter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
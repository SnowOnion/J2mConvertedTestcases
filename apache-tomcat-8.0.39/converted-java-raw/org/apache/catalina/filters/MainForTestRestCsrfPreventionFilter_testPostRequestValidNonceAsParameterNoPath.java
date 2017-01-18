package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestValidNonceAsParameterNoPath {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestValidNonceAsParameterNoPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
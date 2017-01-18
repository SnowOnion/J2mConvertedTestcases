package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter2;

public class MainForTestRestCsrfPreventionFilter2_testRestCsrfProtectionWithRequestParams {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter2().testRestCsrfProtectionWithRequestParams();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestMultipleValidNoncesAsParameterValidPath {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestMultipleValidNoncesAsParameterValidPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
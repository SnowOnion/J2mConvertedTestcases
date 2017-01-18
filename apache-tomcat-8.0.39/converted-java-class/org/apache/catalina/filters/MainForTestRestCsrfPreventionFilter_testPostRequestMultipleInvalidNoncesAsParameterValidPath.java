package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestMultipleInvalidNoncesAsParameterValidPath {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestMultipleInvalidNoncesAsParameterValidPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
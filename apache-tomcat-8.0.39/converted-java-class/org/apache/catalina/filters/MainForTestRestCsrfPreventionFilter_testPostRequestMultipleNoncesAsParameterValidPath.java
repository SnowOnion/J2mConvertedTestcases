package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestMultipleNoncesAsParameterValidPath {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter().testPostRequestMultipleNoncesAsParameterValidPath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
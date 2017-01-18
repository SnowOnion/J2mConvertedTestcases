package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter2;

public class MainForTestCsrfPreventionFilter2_testLruCacheConcurrency {
	public static void main(String[] args) {
		try {
			new TestCsrfPreventionFilter2().testLruCacheConcurrency();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
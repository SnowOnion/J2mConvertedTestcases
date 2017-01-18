package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter2;

public class MainForTestRestCsrfPreventionFilter2_testRestCsrfProtectionWithHeader {
	public static void main(String[] args) {
		try {
			new TestRestCsrfPreventionFilter2().testRestCsrfProtectionWithHeader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
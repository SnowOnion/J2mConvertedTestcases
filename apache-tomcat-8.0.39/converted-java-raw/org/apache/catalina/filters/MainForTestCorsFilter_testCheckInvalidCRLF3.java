package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidCRLF3 {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckInvalidCRLF3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
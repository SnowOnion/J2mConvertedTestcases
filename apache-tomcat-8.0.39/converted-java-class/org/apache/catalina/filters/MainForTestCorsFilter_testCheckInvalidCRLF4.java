package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidCRLF4 {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckInvalidCRLF4();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
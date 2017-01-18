package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidCRLF2 {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckInvalidCRLF2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
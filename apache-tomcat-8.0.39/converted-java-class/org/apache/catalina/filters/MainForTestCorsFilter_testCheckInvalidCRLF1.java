package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidCRLF1 {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckInvalidCRLF1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
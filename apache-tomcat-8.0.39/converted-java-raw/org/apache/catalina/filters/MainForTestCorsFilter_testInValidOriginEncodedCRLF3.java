package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInValidOriginEncodedCRLF3 {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testInValidOriginEncodedCRLF3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
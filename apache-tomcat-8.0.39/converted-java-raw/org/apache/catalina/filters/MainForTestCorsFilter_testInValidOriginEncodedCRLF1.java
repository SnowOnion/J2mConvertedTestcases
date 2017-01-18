package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testInValidOriginEncodedCRLF1 {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testInValidOriginEncodedCRLF1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
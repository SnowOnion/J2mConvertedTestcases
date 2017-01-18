package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesCORSRequestTypeNotCORS {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDecorateCORSPropertiesCORSRequestTypeNotCORS();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
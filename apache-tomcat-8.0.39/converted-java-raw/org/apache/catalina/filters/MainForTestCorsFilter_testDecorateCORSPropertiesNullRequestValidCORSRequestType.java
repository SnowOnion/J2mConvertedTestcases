package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesNullRequestValidCORSRequestType {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDecorateCORSPropertiesNullRequestValidCORSRequestType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
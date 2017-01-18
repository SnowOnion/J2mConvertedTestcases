package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesNullRequestNullCORSRequestType {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDecorateCORSPropertiesNullRequestNullCORSRequestType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateCORSPropertiesValidRequestNullRequestType {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDecorateCORSPropertiesValidRequestNullRequestType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
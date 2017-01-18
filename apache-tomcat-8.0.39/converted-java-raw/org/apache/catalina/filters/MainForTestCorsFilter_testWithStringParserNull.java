package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testWithStringParserNull {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testWithStringParserNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
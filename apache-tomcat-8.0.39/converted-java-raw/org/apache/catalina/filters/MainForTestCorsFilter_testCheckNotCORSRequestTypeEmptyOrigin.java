package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckNotCORSRequestTypeEmptyOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckNotCORSRequestTypeEmptyOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
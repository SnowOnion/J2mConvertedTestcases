package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckNullRequestMethod {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testCheckNullRequestMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
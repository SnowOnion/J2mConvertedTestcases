package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterNullRequestResponse {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterNullRequestResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
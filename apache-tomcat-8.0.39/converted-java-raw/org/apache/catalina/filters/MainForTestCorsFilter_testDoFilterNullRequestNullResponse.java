package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterNullRequestNullResponse {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterNullRequestNullResponse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
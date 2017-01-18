package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testExcludedResponseStatusCode {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testExcludedResponseStatusCode();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
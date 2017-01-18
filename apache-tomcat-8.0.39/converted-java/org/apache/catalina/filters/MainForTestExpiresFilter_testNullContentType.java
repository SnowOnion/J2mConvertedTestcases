package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testNullContentType {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testNullContentType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
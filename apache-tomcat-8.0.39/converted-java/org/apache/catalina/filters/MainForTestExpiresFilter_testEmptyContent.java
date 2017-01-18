package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testEmptyContent {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testEmptyContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
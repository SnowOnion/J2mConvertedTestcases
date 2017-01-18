package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testIntsToCommaDelimitedString {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testIntsToCommaDelimitedString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testLruCacheSerializable {
	public static void main(String[] args) {
		try {
			new TestCsrfPreventionFilter().testLruCacheSerializable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
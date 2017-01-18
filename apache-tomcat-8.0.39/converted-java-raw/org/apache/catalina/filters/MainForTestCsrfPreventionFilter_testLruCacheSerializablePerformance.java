package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testLruCacheSerializablePerformance {
	public static void main(String[] args) {
		try {
			new TestCsrfPreventionFilter().testLruCacheSerializablePerformance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
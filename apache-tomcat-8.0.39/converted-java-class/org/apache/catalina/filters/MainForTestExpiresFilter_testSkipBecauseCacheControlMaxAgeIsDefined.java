package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testSkipBecauseCacheControlMaxAgeIsDefined {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testSkipBecauseCacheControlMaxAgeIsDefined();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testSkipBecauseExpiresIsDefined {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testSkipBecauseExpiresIsDefined();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
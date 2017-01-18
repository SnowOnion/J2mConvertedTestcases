package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testParseExpiresConfigurationMonoDuration {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testParseExpiresConfigurationMonoDuration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
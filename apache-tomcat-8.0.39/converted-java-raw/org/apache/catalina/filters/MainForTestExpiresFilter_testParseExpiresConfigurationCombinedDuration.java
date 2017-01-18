package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testParseExpiresConfigurationCombinedDuration {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testParseExpiresConfigurationCombinedDuration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testUseMajorTypeExpiresConfiguration {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testUseMajorTypeExpiresConfiguration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
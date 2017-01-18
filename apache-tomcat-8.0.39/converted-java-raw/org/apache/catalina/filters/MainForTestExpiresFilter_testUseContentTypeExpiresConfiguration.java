package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testUseContentTypeExpiresConfiguration {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testUseContentTypeExpiresConfiguration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
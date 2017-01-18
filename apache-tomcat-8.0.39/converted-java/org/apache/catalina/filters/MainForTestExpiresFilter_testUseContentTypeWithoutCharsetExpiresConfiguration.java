package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testUseContentTypeWithoutCharsetExpiresConfiguration {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testUseContentTypeWithoutCharsetExpiresConfiguration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
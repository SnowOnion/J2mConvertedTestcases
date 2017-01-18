package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testConfiguration {
	public static void main(String[] args) {
		try {
			new TestExpiresFilter().testConfiguration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
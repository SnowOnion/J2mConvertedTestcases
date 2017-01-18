package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDecorateRequestDisabled {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDecorateRequestDisabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testDoFilterNoOrigin {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testDoFilterNoOrigin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
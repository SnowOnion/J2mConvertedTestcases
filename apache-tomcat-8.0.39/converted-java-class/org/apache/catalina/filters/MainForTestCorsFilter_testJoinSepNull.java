package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testJoinSepNull {
	public static void main(String[] args) {
		try {
			new TestCorsFilter().testJoinSepNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
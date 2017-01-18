package org.apache.catalina.filters;

import org.apache.catalina.filters.TestAddCharSetFilter;

public class MainForTestAddCharSetFilter_testSystemMixedCase {
	public static void main(String[] args) {
		try {
			new TestAddCharSetFilter().testSystemMixedCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
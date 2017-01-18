package org.apache.catalina.filters;

import org.apache.catalina.filters.TestAddCharSetFilter;

public class MainForTestAddCharSetFilter_testDefaultMixedCase {
	public static void main(String[] args) {
		try {
			new TestAddCharSetFilter().testDefaultMixedCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
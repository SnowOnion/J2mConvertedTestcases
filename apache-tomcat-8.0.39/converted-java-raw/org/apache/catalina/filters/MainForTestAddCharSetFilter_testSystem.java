package org.apache.catalina.filters;

import org.apache.catalina.filters.TestAddCharSetFilter;

public class MainForTestAddCharSetFilter_testSystem {
	public static void main(String[] args) {
		try {
			new TestAddCharSetFilter().testSystem();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.filters;

import org.apache.catalina.filters.TestAddCharSetFilter;

public class MainForTestAddCharSetFilter_testDefault {
	public static void main(String[] args) {
		try {
			new TestAddCharSetFilter().testDefault();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
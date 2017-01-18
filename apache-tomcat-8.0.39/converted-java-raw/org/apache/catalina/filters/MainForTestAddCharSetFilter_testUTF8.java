package org.apache.catalina.filters;

import org.apache.catalina.filters.TestAddCharSetFilter;

public class MainForTestAddCharSetFilter_testUTF8 {
	public static void main(String[] args) {
		try {
			new TestAddCharSetFilter().testUTF8();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
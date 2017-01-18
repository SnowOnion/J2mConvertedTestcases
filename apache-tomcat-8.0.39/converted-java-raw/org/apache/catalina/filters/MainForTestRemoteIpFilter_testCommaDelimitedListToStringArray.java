package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testCommaDelimitedListToStringArray {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testCommaDelimitedListToStringArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
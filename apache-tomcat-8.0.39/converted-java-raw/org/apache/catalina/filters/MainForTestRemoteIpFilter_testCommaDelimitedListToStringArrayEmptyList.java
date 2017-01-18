package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testCommaDelimitedListToStringArrayEmptyList {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testCommaDelimitedListToStringArrayEmptyList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
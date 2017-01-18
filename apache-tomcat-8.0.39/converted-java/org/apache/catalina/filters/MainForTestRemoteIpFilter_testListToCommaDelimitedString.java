package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testListToCommaDelimitedString {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testListToCommaDelimitedString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
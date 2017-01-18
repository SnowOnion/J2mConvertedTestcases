package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testListToCommaDelimitedStringMixedSpaceChars {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testListToCommaDelimitedStringMixedSpaceChars();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
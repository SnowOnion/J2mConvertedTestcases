package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testRequestAttributesForAccessLog {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testRequestAttributesForAccessLog();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
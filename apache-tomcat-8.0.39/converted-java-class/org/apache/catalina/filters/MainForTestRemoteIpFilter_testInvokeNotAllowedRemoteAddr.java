package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testInvokeNotAllowedRemoteAddr {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testInvokeNotAllowedRemoteAddr();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
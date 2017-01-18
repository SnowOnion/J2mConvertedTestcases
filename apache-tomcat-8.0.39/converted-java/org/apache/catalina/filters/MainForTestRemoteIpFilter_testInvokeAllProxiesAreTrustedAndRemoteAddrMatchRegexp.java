package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testInvokeAllProxiesAreTrustedAndRemoteAddrMatchRegexp {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testInvokeAllProxiesAreTrustedAndRemoteAddrMatchRegexp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
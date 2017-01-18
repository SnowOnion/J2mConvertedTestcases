package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testInvokeAllProxiesAreTrustedOrInternal {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testInvokeAllProxiesAreTrustedOrInternal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
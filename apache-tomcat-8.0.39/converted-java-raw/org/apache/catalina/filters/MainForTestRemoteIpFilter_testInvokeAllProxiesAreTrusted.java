package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testInvokeAllProxiesAreTrusted {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testInvokeAllProxiesAreTrusted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
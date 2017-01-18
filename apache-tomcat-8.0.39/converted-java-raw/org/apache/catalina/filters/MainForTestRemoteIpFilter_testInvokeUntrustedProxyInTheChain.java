package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testInvokeUntrustedProxyInTheChain {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testInvokeUntrustedProxyInTheChain();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
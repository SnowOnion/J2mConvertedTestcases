package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testInvokeAllProxiesAreInternal {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testInvokeAllProxiesAreInternal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
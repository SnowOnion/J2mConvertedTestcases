package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllProxiesAreTrustedAndRemoteAddrMatchRegexp {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeAllProxiesAreTrustedAndRemoteAddrMatchRegexp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
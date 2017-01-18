package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllProxiesAreTrustedOrInternal {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeAllProxiesAreTrustedOrInternal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
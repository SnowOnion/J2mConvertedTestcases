package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllProxiesAreTrusted {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeAllProxiesAreTrusted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeUntrustedProxyInTheChain {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeUntrustedProxyInTheChain();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
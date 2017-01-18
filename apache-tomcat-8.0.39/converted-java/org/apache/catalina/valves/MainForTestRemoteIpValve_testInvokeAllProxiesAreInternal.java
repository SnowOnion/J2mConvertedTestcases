package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllProxiesAreInternal {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeAllProxiesAreInternal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
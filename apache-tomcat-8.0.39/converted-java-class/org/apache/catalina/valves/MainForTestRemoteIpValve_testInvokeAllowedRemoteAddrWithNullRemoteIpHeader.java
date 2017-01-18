package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeAllowedRemoteAddrWithNullRemoteIpHeader {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeAllowedRemoteAddrWithNullRemoteIpHeader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
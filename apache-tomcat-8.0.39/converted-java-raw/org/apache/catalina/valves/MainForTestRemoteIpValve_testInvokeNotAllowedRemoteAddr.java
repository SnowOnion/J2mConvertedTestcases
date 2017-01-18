package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeNotAllowedRemoteAddr {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeNotAllowedRemoteAddr();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
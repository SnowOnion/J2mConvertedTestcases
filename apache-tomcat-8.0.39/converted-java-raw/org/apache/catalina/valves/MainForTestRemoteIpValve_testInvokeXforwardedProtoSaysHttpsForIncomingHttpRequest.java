package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoSaysHttpsForIncomingHttpRequest {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeXforwardedProtoSaysHttpsForIncomingHttpRequest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
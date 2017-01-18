package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoSaysHttpForIncomingHttpsRequest {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeXforwardedProtoSaysHttpForIncomingHttpsRequest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
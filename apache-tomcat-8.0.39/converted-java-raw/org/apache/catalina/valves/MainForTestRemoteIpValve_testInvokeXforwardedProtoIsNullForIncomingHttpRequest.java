package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoIsNullForIncomingHttpRequest {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeXforwardedProtoIsNullForIncomingHttpRequest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
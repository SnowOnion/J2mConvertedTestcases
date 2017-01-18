package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testInvokeXforwardedProtoIsNullForIncomingHttpsRequest {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testInvokeXforwardedProtoIsNullForIncomingHttpsRequest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
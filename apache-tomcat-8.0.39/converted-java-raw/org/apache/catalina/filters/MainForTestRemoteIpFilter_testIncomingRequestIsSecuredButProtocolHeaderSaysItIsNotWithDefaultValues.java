package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRemoteIpFilter;

public class MainForTestRemoteIpFilter_testIncomingRequestIsSecuredButProtocolHeaderSaysItIsNotWithDefaultValues {
	public static void main(String[] args) {
		try {
			new TestRemoteIpFilter().testIncomingRequestIsSecuredButProtocolHeaderSaysItIsNotWithDefaultValues();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
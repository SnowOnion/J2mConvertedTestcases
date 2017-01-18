package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testRequestAttributesForAccessLog {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testRequestAttributesForAccessLog();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
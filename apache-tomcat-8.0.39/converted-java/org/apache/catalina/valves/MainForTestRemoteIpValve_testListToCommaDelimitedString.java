package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testListToCommaDelimitedString {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testListToCommaDelimitedString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
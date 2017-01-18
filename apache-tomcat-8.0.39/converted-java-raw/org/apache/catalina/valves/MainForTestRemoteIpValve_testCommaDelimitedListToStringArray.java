package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testCommaDelimitedListToStringArray {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testCommaDelimitedListToStringArray();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
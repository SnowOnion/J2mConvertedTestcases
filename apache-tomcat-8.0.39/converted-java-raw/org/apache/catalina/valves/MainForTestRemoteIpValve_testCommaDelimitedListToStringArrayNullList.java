package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testCommaDelimitedListToStringArrayNullList {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testCommaDelimitedListToStringArrayNullList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
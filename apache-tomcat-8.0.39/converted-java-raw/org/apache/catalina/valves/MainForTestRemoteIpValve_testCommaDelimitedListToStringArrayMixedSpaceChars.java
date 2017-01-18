package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testCommaDelimitedListToStringArrayMixedSpaceChars {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testCommaDelimitedListToStringArrayMixedSpaceChars();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
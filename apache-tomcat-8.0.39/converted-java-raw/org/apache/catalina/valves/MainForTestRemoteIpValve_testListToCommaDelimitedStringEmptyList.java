package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRemoteIpValve;

public class MainForTestRemoteIpValve_testListToCommaDelimitedStringEmptyList {
	public static void main(String[] args) {
		try {
			new TestRemoteIpValve().testListToCommaDelimitedStringEmptyList();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
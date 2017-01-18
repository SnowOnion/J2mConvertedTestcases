package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRequestFilterValve;

public class MainForTestRequestFilterValve_testRemoteAddrValveIPv4 {
	public static void main(String[] args) {
		try {
			new TestRequestFilterValve().testRemoteAddrValveIPv4();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
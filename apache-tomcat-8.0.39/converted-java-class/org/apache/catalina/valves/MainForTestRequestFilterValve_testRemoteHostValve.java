package org.apache.catalina.valves;

import org.apache.catalina.valves.TestRequestFilterValve;

public class MainForTestRequestFilterValve_testRemoteHostValve {
	public static void main(String[] args) {
		try {
			new TestRequestFilterValve().testRemoteHostValve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
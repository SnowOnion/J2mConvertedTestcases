package org.apache.catalina.valves;

import org.apache.catalina.valves.TestAccessLogValve;

public class MainForTestAccessLogValve_testBug54044 {
	public static void main(String[] args) {
		try {
			new TestAccessLogValve().testBug54044();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
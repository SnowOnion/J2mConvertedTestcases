package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_alpha {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().alpha();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
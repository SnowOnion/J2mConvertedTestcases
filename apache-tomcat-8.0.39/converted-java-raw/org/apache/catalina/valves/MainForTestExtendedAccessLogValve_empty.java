package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_empty {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().empty();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
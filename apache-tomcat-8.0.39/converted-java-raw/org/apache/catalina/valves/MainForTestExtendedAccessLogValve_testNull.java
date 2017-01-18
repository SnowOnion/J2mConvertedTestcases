package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_testNull {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().testNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
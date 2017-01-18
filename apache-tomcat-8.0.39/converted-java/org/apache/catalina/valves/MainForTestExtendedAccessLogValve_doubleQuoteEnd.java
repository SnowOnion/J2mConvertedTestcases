package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_doubleQuoteEnd {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().doubleQuoteEnd();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
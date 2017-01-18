package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_doubleQuoteStart {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().doubleQuoteStart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
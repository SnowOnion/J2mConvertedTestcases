package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_doubleQuoteMiddle {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().doubleQuoteMiddle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
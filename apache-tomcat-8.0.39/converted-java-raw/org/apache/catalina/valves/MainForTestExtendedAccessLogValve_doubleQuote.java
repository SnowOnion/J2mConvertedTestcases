package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_doubleQuote {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().doubleQuote();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
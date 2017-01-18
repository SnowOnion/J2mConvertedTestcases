package org.apache.catalina.valves;

import org.apache.catalina.valves.TestExtendedAccessLogValve;

public class MainForTestExtendedAccessLogValve_singleQuoteMiddle {
	public static void main(String[] args) {
		try {
			new TestExtendedAccessLogValve().singleQuoteMiddle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.valves;

import org.apache.catalina.valves.TestErrorReportValve;

public class MainForTestErrorReportValve_testBug54536 {
	public static void main(String[] args) {
		try {
			new TestErrorReportValve().testBug54536();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.valves;

import org.apache.catalina.valves.TestErrorReportValve;

public class MainForTestErrorReportValve_testBug56042 {
	public static void main(String[] args) {
		try {
			new TestErrorReportValve().testBug56042();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
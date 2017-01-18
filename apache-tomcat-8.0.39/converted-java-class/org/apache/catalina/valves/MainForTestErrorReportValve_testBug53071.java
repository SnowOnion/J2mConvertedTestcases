package org.apache.catalina.valves;

import org.apache.catalina.valves.TestErrorReportValve;

public class MainForTestErrorReportValve_testBug53071 {
	public static void main(String[] args) {
		try {
			new TestErrorReportValve().testBug53071();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
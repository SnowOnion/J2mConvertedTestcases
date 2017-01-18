package org.apache.catalina.valves;

import org.apache.catalina.valves.TestErrorReportValve;

public class MainForTestErrorReportValve_testBug54220DoNotSetNotFound {
	public static void main(String[] args) {
		try {
			new TestErrorReportValve().testBug54220DoNotSetNotFound();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
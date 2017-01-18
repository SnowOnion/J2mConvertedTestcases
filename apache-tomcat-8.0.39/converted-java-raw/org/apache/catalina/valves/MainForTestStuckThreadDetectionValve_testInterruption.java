package org.apache.catalina.valves;

import org.apache.catalina.valves.TestStuckThreadDetectionValve;

public class MainForTestStuckThreadDetectionValve_testInterruption {
	public static void main(String[] args) {
		try {
			new TestStuckThreadDetectionValve().testInterruption();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
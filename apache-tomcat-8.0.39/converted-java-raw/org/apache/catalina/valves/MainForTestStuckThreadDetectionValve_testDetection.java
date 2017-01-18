package org.apache.catalina.valves;

import org.apache.catalina.valves.TestStuckThreadDetectionValve;

public class MainForTestStuckThreadDetectionValve_testDetection {
	public static void main(String[] args) {
		try {
			new TestStuckThreadDetectionValve().testDetection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
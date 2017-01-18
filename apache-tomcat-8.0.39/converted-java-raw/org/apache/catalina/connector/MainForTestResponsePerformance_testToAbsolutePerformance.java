package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponsePerformance;

public class MainForTestResponsePerformance_testToAbsolutePerformance {
	public static void main(String[] args) {
		try {
			new TestResponsePerformance().testToAbsolutePerformance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
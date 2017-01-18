package org.apache.tomcat.util.bcel;

import org.apache.tomcat.util.bcel.TesterPerformance;

public class MainForTesterPerformance_testClassParserPerformance {
	public static void main(String[] args) {
		try {
			new TesterPerformance().testClassParserPerformance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
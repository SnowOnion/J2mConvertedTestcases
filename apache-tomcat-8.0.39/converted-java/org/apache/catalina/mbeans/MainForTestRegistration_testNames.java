package org.apache.catalina.mbeans;

import org.apache.catalina.mbeans.TestRegistration;

public class MainForTestRegistration_testNames {
	public static void main(String[] args) {
		try {
			new TestRegistration().testNames();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
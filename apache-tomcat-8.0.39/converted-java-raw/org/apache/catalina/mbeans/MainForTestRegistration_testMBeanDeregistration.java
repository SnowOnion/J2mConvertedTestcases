package org.apache.catalina.mbeans;

import org.apache.catalina.mbeans.TestRegistration;

public class MainForTestRegistration_testMBeanDeregistration {
	public static void main(String[] args) {
		try {
			new TestRegistration().testMBeanDeregistration();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
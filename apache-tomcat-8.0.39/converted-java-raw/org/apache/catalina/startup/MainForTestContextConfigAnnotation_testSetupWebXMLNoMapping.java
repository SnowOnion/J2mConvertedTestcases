package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testSetupWebXMLNoMapping {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testSetupWebXMLNoMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
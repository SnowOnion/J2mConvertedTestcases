package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testNoMapping {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testNoMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
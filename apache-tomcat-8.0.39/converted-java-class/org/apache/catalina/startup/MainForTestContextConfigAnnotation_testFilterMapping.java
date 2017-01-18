package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testFilterMapping {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testFilterMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
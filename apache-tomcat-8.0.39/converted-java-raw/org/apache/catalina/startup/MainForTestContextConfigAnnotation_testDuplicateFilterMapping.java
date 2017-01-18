package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testDuplicateFilterMapping {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testDuplicateFilterMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
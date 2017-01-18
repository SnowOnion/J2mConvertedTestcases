package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testDuplicateMapping {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testDuplicateMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testAnnotation {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testAnnotation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
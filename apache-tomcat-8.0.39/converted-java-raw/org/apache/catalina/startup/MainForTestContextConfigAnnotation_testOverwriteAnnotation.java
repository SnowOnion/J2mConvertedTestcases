package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testOverwriteAnnotation {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testOverwriteAnnotation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
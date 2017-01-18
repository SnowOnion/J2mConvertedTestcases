package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testOverwriteFilterMapping {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testOverwriteFilterMapping();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
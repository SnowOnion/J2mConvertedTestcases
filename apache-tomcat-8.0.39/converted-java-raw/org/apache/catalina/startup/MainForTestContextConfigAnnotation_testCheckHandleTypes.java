package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfigAnnotation;

public class MainForTestContextConfigAnnotation_testCheckHandleTypes {
	public static void main(String[] args) {
		try {
			new TestContextConfigAnnotation().testCheckHandleTypes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
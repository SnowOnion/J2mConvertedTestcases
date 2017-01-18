package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextResources;

public class MainForTestStandardContextResources_testResourcesWebInfClasses {
	public static void main(String[] args) {
		try {
			new TestStandardContextResources().testResourcesWebInfClasses();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
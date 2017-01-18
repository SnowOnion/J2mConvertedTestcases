package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextResources;

public class MainForTestStandardContextResources_testResourcesAbsoluteOrdering {
	public static void main(String[] args) {
		try {
			new TestStandardContextResources().testResourcesAbsoluteOrdering();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
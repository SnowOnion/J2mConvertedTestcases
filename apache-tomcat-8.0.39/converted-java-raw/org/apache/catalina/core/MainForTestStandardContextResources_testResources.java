package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextResources;

public class MainForTestStandardContextResources_testResources {
	public static void main(String[] args) {
		try {
			new TestStandardContextResources().testResources();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
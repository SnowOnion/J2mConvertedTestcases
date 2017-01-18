package org.apache.catalina.loader;

import org.apache.catalina.loader.TestVirtualContext;

public class MainForTestVirtualContext_testAdditionalWebInfClassesPaths {
	public static void main(String[] args) {
		try {
			new TestVirtualContext().testAdditionalWebInfClassesPaths();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
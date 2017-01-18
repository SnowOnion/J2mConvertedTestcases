package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestDirResourceSet;

public class MainForTestDirResourceSet_testNoArgConstructor {
	public static void main(String[] args) {
		try {
			new TestDirResourceSet().testNoArgConstructor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestJarResourceSet;

public class MainForTestJarResourceSet_testNoArgConstructor {
	public static void main(String[] args) {
		try {
			new TestJarResourceSet().testNoArgConstructor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
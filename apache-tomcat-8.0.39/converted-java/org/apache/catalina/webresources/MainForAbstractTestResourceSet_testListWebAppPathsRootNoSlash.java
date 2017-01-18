package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListWebAppPathsRootNoSlash {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListWebAppPathsRootNoSlash();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
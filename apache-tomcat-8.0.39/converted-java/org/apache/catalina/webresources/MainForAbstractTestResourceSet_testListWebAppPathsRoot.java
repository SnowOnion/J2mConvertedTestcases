package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListWebAppPathsRoot {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListWebAppPathsRoot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListWebAppPathsEmpty {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListWebAppPathsEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListWebAppPathsFile {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListWebAppPathsFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
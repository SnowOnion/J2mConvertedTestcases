package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListFile {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
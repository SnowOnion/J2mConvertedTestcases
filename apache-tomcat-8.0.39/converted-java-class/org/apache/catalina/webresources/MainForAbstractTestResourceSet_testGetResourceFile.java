package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetResourceFile {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetResourceFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
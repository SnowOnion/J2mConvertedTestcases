package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetManifest {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetManifest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
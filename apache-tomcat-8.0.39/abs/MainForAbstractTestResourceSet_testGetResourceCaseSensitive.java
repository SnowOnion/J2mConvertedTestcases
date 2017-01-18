package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetResourceCaseSensitive {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetResourceCaseSensitive();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
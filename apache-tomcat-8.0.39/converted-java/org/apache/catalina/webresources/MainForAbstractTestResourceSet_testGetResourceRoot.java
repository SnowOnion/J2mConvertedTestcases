package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetResourceRoot {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetResourceRoot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
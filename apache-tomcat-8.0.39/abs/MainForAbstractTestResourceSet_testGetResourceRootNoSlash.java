package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetResourceRootNoSlash {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetResourceRootNoSlash();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
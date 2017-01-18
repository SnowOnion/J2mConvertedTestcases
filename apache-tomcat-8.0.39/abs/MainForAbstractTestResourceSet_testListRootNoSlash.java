package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListRootNoSlash {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListRootNoSlash();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
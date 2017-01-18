package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetCanonicalPathDoesNotExist {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetCanonicalPathDoesNotExist();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
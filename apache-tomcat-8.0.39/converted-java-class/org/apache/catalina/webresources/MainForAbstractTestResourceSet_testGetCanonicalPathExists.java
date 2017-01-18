package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetCanonicalPathExists {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetCanonicalPathExists();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
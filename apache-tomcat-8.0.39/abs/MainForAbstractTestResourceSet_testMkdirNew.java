package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testMkdirNew {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testMkdirNew();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testMkdirEmpty {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testMkdirEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
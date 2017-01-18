package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testMkdirRoot {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testMkdirRoot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
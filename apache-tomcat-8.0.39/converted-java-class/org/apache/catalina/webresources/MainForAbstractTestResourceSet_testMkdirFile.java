package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testMkdirFile {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testMkdirFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
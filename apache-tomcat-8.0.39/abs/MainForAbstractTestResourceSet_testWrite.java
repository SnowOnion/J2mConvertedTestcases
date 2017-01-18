package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testWrite {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testWrite();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
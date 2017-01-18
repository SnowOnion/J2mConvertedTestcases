package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testWriteDirA {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testWriteDirA();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
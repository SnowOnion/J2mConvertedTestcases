package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testWriteRoot {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testWriteRoot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
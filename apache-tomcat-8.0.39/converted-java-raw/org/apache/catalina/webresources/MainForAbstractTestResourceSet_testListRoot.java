package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListRoot {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListRoot();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
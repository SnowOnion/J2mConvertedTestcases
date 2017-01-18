package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testListEmpty {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testListEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
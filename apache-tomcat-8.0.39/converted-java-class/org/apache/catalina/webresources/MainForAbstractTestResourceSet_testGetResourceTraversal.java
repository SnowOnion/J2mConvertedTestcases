package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testGetResourceTraversal {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testGetResourceTraversal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testWriteNull {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testWriteNull();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
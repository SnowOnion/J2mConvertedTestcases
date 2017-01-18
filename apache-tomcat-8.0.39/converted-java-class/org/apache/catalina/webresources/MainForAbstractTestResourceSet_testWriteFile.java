package org.apache.catalina.webresources;

import org.apache.catalina.webresources.AbstractTestResourceSet;

public class MainForAbstractTestResourceSet_testWriteFile {
	public static void main(String[] args) {
		try {
			new AbstractTestResourceSet().testWriteFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
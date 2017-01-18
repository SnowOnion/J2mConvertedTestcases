package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestFileResource;

public class MainForTestFileResource_testGetCodePath {
	public static void main(String[] args) {
		try {
			new TestFileResource().testGetCodePath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
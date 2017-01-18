package org.apache.catalina.loader;

import org.apache.catalina.loader.TestVirtualContext;

public class MainForTestVirtualContext_testVirtualClassLoader {
	public static void main(String[] args) {
		try {
			new TestVirtualContext().testVirtualClassLoader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
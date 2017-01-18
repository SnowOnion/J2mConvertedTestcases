package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderWeaving;

public class MainForTestWebappClassLoaderWeaving_testAddingNullTransformerThrowsException {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoaderWeaving().testAddingNullTransformerThrowsException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
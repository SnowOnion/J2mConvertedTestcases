package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoaderWeaving;

public class MainForTestWebappClassLoaderWeaving_testNoWeaving {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoaderWeaving().testNoWeaving();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
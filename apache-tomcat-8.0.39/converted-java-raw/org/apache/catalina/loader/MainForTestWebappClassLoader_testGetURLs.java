package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoader;

public class MainForTestWebappClassLoader_testGetURLs {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoader().testGetURLs();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
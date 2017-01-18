package org.apache.catalina.loader;

import org.apache.catalina.loader.TestWebappClassLoader;

public class MainForTestWebappClassLoader_testFilter {
	public static void main(String[] args) {
		try {
			new TestWebappClassLoader().testFilter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
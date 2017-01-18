package org.apache.catalina.core;

import org.apache.catalina.core.TestNamingContextListener;

public class MainForTestNamingContextListener_testBug54096 {
	public static void main(String[] args) {
		try {
			new TestNamingContextListener().testBug54096();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.core;

import org.apache.catalina.core.TestNamingContextListener;

public class MainForTestNamingContextListener_testBug49132 {
	public static void main(String[] args) {
		try {
			new TestNamingContextListener().testBug49132();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
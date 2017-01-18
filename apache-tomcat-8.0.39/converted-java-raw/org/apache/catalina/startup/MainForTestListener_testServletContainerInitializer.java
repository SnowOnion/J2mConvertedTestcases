package org.apache.catalina.startup;

import org.apache.catalina.startup.TestListener;

public class MainForTestListener_testServletContainerInitializer {
	public static void main(String[] args) {
		try {
			new TestListener().testServletContainerInitializer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
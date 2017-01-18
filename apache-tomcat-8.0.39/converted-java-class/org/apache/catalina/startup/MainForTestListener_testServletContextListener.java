package org.apache.catalina.startup;

import org.apache.catalina.startup.TestListener;

public class MainForTestListener_testServletContextListener {
	public static void main(String[] args) {
		try {
			new TestListener().testServletContextListener();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
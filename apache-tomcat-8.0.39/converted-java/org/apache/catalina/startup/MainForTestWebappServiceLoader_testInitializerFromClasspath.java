package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testInitializerFromClasspath {
	public static void main(String[] args) {
		try {
			new TestWebappServiceLoader().testInitializerFromClasspath();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
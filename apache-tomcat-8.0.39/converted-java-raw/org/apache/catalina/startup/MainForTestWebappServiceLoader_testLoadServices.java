package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testLoadServices {
	public static void main(String[] args) {
		try {
			new TestWebappServiceLoader().testLoadServices();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
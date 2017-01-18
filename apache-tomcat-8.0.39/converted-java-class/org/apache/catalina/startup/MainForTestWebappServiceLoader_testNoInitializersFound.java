package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testNoInitializersFound {
	public static void main(String[] args) {
		try {
			new TestWebappServiceLoader().testNoInitializersFound();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testWithOrdering {
	public static void main(String[] args) {
		try {
			new TestWebappServiceLoader().testWithOrdering();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
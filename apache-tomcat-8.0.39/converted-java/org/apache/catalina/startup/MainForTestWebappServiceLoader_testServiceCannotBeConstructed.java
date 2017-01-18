package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testServiceCannotBeConstructed {
	public static void main(String[] args) {
		try {
			new TestWebappServiceLoader().testServiceCannotBeConstructed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.catalina.startup;

import org.apache.catalina.startup.TestWebappServiceLoader;

public class MainForTestWebappServiceLoader_testServiceIsNotExpectedType {
	public static void main(String[] args) {
		try {
			new TestWebappServiceLoader().testServiceIsNotExpectedType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
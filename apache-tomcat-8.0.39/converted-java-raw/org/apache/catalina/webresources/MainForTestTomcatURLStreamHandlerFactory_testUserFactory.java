package org.apache.catalina.webresources;

import org.apache.catalina.webresources.TestTomcatURLStreamHandlerFactory;

public class MainForTestTomcatURLStreamHandlerFactory_testUserFactory {
	public static void main(String[] args) {
		try {
			new TestTomcatURLStreamHandlerFactory().testUserFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
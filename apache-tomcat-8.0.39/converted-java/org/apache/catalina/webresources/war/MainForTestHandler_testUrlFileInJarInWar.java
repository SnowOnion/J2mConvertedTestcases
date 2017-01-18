package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandler;

public class MainForTestHandler_testUrlFileInJarInWar {
	public static void main(String[] args) {
		try {
			new TestHandler().testUrlFileInJarInWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
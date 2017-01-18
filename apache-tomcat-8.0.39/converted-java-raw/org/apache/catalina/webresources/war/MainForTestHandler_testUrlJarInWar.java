package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandler;

public class MainForTestHandler_testUrlJarInWar {
	public static void main(String[] args) {
		try {
			new TestHandler().testUrlJarInWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
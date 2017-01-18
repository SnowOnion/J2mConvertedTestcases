package org.apache.catalina.webresources.war;

import org.apache.catalina.webresources.war.TestHandler;

public class MainForTestHandler_testUrlWar {
	public static void main(String[] args) {
		try {
			new TestHandler().testUrlWar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
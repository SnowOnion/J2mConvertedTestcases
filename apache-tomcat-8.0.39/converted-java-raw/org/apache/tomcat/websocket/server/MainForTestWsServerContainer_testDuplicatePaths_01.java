package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestWsServerContainer;

public class MainForTestWsServerContainer_testDuplicatePaths_01 {
	public static void main(String[] args) {
		try {
			new TestWsServerContainer().testDuplicatePaths_01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
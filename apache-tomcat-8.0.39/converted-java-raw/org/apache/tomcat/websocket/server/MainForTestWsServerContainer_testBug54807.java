package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestWsServerContainer;

public class MainForTestWsServerContainer_testBug54807 {
	public static void main(String[] args) {
		try {
			new TestWsServerContainer().testBug54807();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
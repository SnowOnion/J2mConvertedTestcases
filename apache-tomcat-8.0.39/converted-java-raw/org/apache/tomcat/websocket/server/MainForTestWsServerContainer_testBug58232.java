package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestWsServerContainer;

public class MainForTestWsServerContainer_testBug58232 {
	public static void main(String[] args) {
		try {
			new TestWsServerContainer().testBug58232();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
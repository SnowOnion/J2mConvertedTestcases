package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testGetOpenSessions {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testGetOpenSessions();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
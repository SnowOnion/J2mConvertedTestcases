package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSessionExpirySession {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSessionExpirySession();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
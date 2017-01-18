package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSessionExpiryContainer {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSessionExpiryContainer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
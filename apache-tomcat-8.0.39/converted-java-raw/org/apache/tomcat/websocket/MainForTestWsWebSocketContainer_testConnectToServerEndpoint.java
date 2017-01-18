package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testConnectToServerEndpoint {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testConnectToServerEndpoint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
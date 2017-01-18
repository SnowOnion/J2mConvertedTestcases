package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testConnectToServerEndpointInvalidScheme {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testConnectToServerEndpointInvalidScheme();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
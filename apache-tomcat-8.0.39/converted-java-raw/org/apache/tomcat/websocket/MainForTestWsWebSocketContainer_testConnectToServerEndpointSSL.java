package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testConnectToServerEndpointSSL {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testConnectToServerEndpointSSL();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
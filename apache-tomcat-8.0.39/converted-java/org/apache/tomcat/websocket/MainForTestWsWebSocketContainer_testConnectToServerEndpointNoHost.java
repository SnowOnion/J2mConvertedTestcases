package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testConnectToServerEndpointNoHost {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testConnectToServerEndpointNoHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
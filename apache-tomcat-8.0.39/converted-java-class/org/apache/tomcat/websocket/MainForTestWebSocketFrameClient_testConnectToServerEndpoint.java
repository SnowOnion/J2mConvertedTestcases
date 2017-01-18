package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWebSocketFrameClient;

public class MainForTestWebSocketFrameClient_testConnectToServerEndpoint {
	public static void main(String[] args) {
		try {
			new TestWebSocketFrameClient().testConnectToServerEndpoint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
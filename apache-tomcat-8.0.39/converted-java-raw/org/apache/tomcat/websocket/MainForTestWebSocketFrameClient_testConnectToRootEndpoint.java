package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWebSocketFrameClient;

public class MainForTestWebSocketFrameClient_testConnectToRootEndpoint {
	public static void main(String[] args) {
		try {
			new TestWebSocketFrameClient().testConnectToRootEndpoint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
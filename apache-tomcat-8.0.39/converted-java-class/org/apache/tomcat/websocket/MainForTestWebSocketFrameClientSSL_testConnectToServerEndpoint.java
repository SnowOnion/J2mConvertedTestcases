package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWebSocketFrameClientSSL;

public class MainForTestWebSocketFrameClientSSL_testConnectToServerEndpoint {
	public static void main(String[] args) {
		try {
			new TestWebSocketFrameClientSSL().testConnectToServerEndpoint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
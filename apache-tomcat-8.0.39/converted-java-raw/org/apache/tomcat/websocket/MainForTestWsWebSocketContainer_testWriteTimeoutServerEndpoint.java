package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testWriteTimeoutServerEndpoint {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testWriteTimeoutServerEndpoint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testWriteTimeoutClientEndpoint {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testWriteTimeoutClientEndpoint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
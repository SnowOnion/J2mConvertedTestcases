package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallBinaryBufferServerBinaryMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallBinaryBufferServerBinaryMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
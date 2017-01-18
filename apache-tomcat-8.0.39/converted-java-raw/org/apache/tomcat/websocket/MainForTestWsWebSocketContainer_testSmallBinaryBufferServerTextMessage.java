package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallBinaryBufferServerTextMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallBinaryBufferServerTextMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
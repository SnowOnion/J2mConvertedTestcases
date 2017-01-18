package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallBinaryBufferClientTextMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallBinaryBufferClientTextMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
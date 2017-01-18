package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallBinaryBufferClientBinaryMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallBinaryBufferClientBinaryMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
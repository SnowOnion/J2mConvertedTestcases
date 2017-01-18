package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallTextBufferServerBinaryMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallTextBufferServerBinaryMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
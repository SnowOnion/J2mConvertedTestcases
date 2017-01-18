package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallTextBufferServerTextMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallTextBufferServerTextMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
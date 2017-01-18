package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallTextBufferClientTextMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallTextBufferClientTextMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
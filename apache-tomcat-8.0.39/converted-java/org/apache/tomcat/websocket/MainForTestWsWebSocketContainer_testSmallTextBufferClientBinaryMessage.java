package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallTextBufferClientBinaryMessage {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testSmallTextBufferClientBinaryMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
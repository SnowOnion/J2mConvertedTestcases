package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testWriteTimeoutServerContainer {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testWriteTimeoutServerContainer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
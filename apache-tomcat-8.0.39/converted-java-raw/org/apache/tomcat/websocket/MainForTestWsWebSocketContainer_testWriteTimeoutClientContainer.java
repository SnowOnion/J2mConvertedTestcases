package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testWriteTimeoutClientContainer {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testWriteTimeoutClientContainer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
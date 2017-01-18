package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testMaxMessageSize01 {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testMaxMessageSize01();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
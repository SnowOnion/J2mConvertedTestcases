package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testMaxMessageSize02 {
	public static void main(String[] args) {
		try {
			new TestWsWebSocketContainer().testMaxMessageSize02();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
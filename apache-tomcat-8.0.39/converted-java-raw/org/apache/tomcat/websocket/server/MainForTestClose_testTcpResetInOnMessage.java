package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testTcpResetInOnMessage {
	public static void main(String[] args) {
		try {
			new TestClose().testTcpResetInOnMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
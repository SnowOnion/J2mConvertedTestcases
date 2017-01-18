package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testTcpCloseInOnMessage {
	public static void main(String[] args) {
		try {
			new TestClose().testTcpCloseInOnMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
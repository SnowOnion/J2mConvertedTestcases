package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testTcpCloseWhenOnMessageSends {
	public static void main(String[] args) {
		try {
			new TestClose().testTcpCloseWhenOnMessageSends();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
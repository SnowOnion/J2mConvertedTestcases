package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testTcpResetWhenOnMessageSends {
	public static void main(String[] args) {
		try {
			new TestClose().testTcpResetWhenOnMessageSends();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
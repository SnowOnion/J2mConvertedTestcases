package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testWsCloseThenTcpResetWhenOnMessageSends {
	public static void main(String[] args) {
		try {
			new TestClose().testWsCloseThenTcpResetWhenOnMessageSends();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
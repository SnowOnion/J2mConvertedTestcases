package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testWsCloseThenTcpCloseWhenOnMessageSends {
	public static void main(String[] args) {
		try {
			new TestClose().testWsCloseThenTcpCloseWhenOnMessageSends();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
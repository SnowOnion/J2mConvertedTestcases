package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testWsCloseThenTcpClose {
	public static void main(String[] args) {
		try {
			new TestClose().testWsCloseThenTcpClose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
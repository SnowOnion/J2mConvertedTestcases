package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testWsCloseThenTcpReset {
	public static void main(String[] args) {
		try {
			new TestClose().testWsCloseThenTcpReset();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
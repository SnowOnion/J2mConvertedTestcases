package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testTcpClose {
	public static void main(String[] args) {
		try {
			new TestClose().testTcpClose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
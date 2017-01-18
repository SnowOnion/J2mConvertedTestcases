package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testTcpReset {
	public static void main(String[] args) {
		try {
			new TestClose().testTcpReset();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
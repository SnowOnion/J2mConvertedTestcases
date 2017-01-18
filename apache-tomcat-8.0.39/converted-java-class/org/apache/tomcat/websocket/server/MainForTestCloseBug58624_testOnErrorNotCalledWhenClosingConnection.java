package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestCloseBug58624;

public class MainForTestCloseBug58624_testOnErrorNotCalledWhenClosingConnection {
	public static void main(String[] args) {
		try {
			new TestCloseBug58624().testOnErrorNotCalledWhenClosingConnection();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
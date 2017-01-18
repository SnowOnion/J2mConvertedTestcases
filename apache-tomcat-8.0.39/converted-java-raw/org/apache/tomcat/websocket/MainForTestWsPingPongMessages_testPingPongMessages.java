package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsPingPongMessages;

public class MainForTestWsPingPongMessages_testPingPongMessages {
	public static void main(String[] args) {
		try {
			new TestWsPingPongMessages().testPingPongMessages();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
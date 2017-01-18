package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWebSocketFrameClientSSL;

public class MainForTestWebSocketFrameClientSSL_testBug56032 {
	public static void main(String[] args) {
		try {
			new TestWebSocketFrameClientSSL().testBug56032();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
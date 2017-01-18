package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsRemoteEndpoint;

public class MainForTestWsRemoteEndpoint_testStreamProgrammatic {
	public static void main(String[] args) {
		try {
			new TestWsRemoteEndpoint().testStreamProgrammatic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
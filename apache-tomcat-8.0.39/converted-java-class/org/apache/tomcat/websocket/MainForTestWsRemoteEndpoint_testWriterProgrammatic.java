package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsRemoteEndpoint;

public class MainForTestWsRemoteEndpoint_testWriterProgrammatic {
	public static void main(String[] args) {
		try {
			new TestWsRemoteEndpoint().testWriterProgrammatic();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsRemoteEndpoint;

public class MainForTestWsRemoteEndpoint_testWriterAnnotation {
	public static void main(String[] args) {
		try {
			new TestWsRemoteEndpoint().testWriterAnnotation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
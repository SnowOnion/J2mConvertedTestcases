package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsRemoteEndpoint;

public class MainForTestWsRemoteEndpoint_testStreamAnnotation {
	public static void main(String[] args) {
		try {
			new TestWsRemoteEndpoint().testStreamAnnotation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestWsRemoteEndpointImplServer;

public class MainForTestWsRemoteEndpointImplServer_testClientDropsConnection {
	public static void main(String[] args) {
		try {
			new TestWsRemoteEndpointImplServer().testClientDropsConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
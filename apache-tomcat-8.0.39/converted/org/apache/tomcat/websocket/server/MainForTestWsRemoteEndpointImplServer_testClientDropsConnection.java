package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestWsRemoteEndpointImplServer;

public class MainForTestWsRemoteEndpointImplServer_testClientDropsConnection {
    public static void main(String[] args) {
        try {
            TestWsRemoteEndpointImplServer.setUpPerTestClass();
            TestWsRemoteEndpointImplServer objTestWsRemoteEndpointImplServer = new TestWsRemoteEndpointImplServer();
            objTestWsRemoteEndpointImplServer.setUp();
            objTestWsRemoteEndpointImplServer.testClientDropsConnection();
            objTestWsRemoteEndpointImplServer.checkBackgroundProcessHasStopped();
            objTestWsRemoteEndpointImplServer.tearDown();
            TestWsRemoteEndpointImplServer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

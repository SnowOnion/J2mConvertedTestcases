package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWebSocketFrameClient;

public class MainForTestWebSocketFrameClient_testConnectToRootEndpoint {
    public static void main(String[] args) {
        try {
            TestWebSocketFrameClient.setUpPerTestClass();
            TestWebSocketFrameClient objTestWebSocketFrameClient = new TestWebSocketFrameClient();
            objTestWebSocketFrameClient.setUp();
            objTestWebSocketFrameClient.testConnectToRootEndpoint();
            objTestWebSocketFrameClient.checkBackgroundProcessHasStopped();
            objTestWebSocketFrameClient.tearDown();
            TestWebSocketFrameClient.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

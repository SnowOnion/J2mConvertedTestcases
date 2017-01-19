package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWebSocketFrameClientSSL;

public class MainForTestWebSocketFrameClientSSL_testConnectToServerEndpoint {
    public static void main(String[] args) {
        try {
            TestWebSocketFrameClientSSL.setUpPerTestClass();
            TestWebSocketFrameClientSSL objTestWebSocketFrameClientSSL = new TestWebSocketFrameClientSSL();
            objTestWebSocketFrameClientSSL.setUp();
            objTestWebSocketFrameClientSSL.testConnectToServerEndpoint();
            objTestWebSocketFrameClientSSL.checkBackgroundProcessHasStopped();
            objTestWebSocketFrameClientSSL.tearDown();
            TestWebSocketFrameClientSSL.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

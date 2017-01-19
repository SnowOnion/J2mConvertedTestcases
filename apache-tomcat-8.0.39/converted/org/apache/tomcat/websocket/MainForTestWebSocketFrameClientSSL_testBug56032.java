package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWebSocketFrameClientSSL;

public class MainForTestWebSocketFrameClientSSL_testBug56032 {
    public static void main(String[] args) {
        try {
            TestWebSocketFrameClientSSL.setUpPerTestClass();
            TestWebSocketFrameClientSSL objTestWebSocketFrameClientSSL = new TestWebSocketFrameClientSSL();
            objTestWebSocketFrameClientSSL.setUp();
            objTestWebSocketFrameClientSSL.testBug56032();
            objTestWebSocketFrameClientSSL.checkBackgroundProcessHasStopped();
            objTestWebSocketFrameClientSSL.tearDown();
            TestWebSocketFrameClientSSL.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

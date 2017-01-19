package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallTextBufferServerBinaryMessage {
    public static void main(String[] args) {
        try {
            TestWsWebSocketContainer.setUpPerTestClass();
            TestWsWebSocketContainer objTestWsWebSocketContainer = new TestWsWebSocketContainer();
            objTestWsWebSocketContainer.setUp();
            objTestWsWebSocketContainer.testSmallTextBufferServerBinaryMessage();
            objTestWsWebSocketContainer.checkBackgroundProcessHasStopped();
            objTestWsWebSocketContainer.tearDown();
            TestWsWebSocketContainer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

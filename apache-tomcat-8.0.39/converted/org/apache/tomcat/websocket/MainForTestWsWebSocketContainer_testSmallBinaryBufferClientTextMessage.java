package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testSmallBinaryBufferClientTextMessage {
    public static void main(String[] args) {
        try {
            TestWsWebSocketContainer.setUpPerTestClass();
            TestWsWebSocketContainer objTestWsWebSocketContainer = new TestWsWebSocketContainer();
            objTestWsWebSocketContainer.setUp();
            objTestWsWebSocketContainer.testSmallBinaryBufferClientTextMessage();
            objTestWsWebSocketContainer.checkBackgroundProcessHasStopped();
            objTestWsWebSocketContainer.tearDown();
            TestWsWebSocketContainer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

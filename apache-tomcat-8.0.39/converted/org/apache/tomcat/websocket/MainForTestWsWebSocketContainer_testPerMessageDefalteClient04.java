package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainer;

public class MainForTestWsWebSocketContainer_testPerMessageDefalteClient04 {
    public static void main(String[] args) {
        try {
            TestWsWebSocketContainer.setUpPerTestClass();
            TestWsWebSocketContainer objTestWsWebSocketContainer = new TestWsWebSocketContainer();
            objTestWsWebSocketContainer.setUp();
            objTestWsWebSocketContainer.testPerMessageDefalteClient04();
            objTestWsWebSocketContainer.checkBackgroundProcessHasStopped();
            objTestWsWebSocketContainer.tearDown();
            TestWsWebSocketContainer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

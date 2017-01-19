package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsWebSocketContainerWithProxy;

public class MainForTestWsWebSocketContainerWithProxy_testWriteTimeoutServerContainer {
    public static void main(String[] args) {
        try {
            TestWsWebSocketContainerWithProxy.init();
            TestWsWebSocketContainerWithProxy.setUpPerTestClass();
            TestWsWebSocketContainerWithProxy objTestWsWebSocketContainerWithProxy = new TestWsWebSocketContainerWithProxy();
            objTestWsWebSocketContainerWithProxy.setPort();
            objTestWsWebSocketContainerWithProxy.setUp();
            objTestWsWebSocketContainerWithProxy.testWriteTimeoutServerContainer();
            objTestWsWebSocketContainerWithProxy.checkBackgroundProcessHasStopped();
            objTestWsWebSocketContainerWithProxy.tearDown();
            TestWsWebSocketContainerWithProxy.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

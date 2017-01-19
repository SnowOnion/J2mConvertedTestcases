package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsSubprotocols;

public class MainForTestWsSubprotocols_testWsSubprotocols {
    public static void main(String[] args) {
        try {
            TestWsSubprotocols.setUpPerTestClass();
            TestWsSubprotocols objTestWsSubprotocols = new TestWsSubprotocols();
            objTestWsSubprotocols.setUp();
            objTestWsSubprotocols.testWsSubprotocols();
            objTestWsSubprotocols.checkBackgroundProcessHasStopped();
            objTestWsSubprotocols.tearDown();
            TestWsSubprotocols.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

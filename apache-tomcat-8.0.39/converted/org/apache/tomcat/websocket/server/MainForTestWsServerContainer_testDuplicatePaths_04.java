package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestWsServerContainer;

public class MainForTestWsServerContainer_testDuplicatePaths_04 {
    public static void main(String[] args) {
        try {
            TestWsServerContainer.setUpPerTestClass();
            TestWsServerContainer objTestWsServerContainer = new TestWsServerContainer();
            objTestWsServerContainer.setUp();
            objTestWsServerContainer.testDuplicatePaths_04();
            objTestWsServerContainer.checkBackgroundProcessHasStopped();
            objTestWsServerContainer.tearDown();
            TestWsServerContainer.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsRemoteEndpoint;

public class MainForTestWsRemoteEndpoint_testStreamProgrammatic {
    public static void main(String[] args) {
        try {
            TestWsRemoteEndpoint.setUpPerTestClass();
            TestWsRemoteEndpoint objTestWsRemoteEndpoint = new TestWsRemoteEndpoint();
            objTestWsRemoteEndpoint.setUp();
            objTestWsRemoteEndpoint.testStreamProgrammatic();
            objTestWsRemoteEndpoint.checkBackgroundProcessHasStopped();
            objTestWsRemoteEndpoint.tearDown();
            TestWsRemoteEndpoint.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

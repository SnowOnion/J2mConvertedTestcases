package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testWsCloseThenTcpClose {
    public static void main(String[] args) {
        try {
            TestClose.setUpPerTestClass();
            TestClose objTestClose = new TestClose();
            objTestClose.setUp();
            objTestClose.testWsCloseThenTcpClose();
            objTestClose.checkBackgroundProcessHasStopped();
            objTestClose.tearDown();
            TestClose.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

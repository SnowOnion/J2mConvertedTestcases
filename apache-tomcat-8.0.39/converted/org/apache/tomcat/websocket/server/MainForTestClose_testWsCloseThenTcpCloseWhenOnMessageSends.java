package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestClose;

public class MainForTestClose_testWsCloseThenTcpCloseWhenOnMessageSends {
    public static void main(String[] args) {
        try {
            TestClose.setUpPerTestClass();
            TestClose objTestClose = new TestClose();
            objTestClose.setUp();
            objTestClose.testWsCloseThenTcpCloseWhenOnMessageSends();
            objTestClose.checkBackgroundProcessHasStopped();
            objTestClose.tearDown();
            TestClose.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.tomcat.websocket.server;

import org.apache.tomcat.websocket.server.TestCloseBug58624;

public class MainForTestCloseBug58624_testOnErrorNotCalledWhenClosingConnection {
    public static void main(String[] args) {
        try {
            TestCloseBug58624.setUpPerTestClass();
            TestCloseBug58624 objTestCloseBug58624 = new TestCloseBug58624();
            objTestCloseBug58624.setUp();
            objTestCloseBug58624.testOnErrorNotCalledWhenClosingConnection();
            objTestCloseBug58624.checkBackgroundProcessHasStopped();
            objTestCloseBug58624.tearDown();
            TestCloseBug58624.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

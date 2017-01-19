package org.apache.tomcat.websocket;

import org.apache.tomcat.websocket.TestWsPingPongMessages;

public class MainForTestWsPingPongMessages_testPingPongMessages {
    public static void main(String[] args) {
        try {
            TestWsPingPongMessages.setUpPerTestClass();
            TestWsPingPongMessages objTestWsPingPongMessages = new TestWsPingPongMessages();
            objTestWsPingPongMessages.setUp();
            objTestWsPingPongMessages.testPingPongMessages();
            objTestWsPingPongMessages.checkBackgroundProcessHasStopped();
            objTestWsPingPongMessages.tearDown();
            TestWsPingPongMessages.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelSenderConnections;

public class MainForTestGroupChannelSenderConnections_testKeepAliveCount {
    public static void main(String[] args) {
        try {
            TestGroupChannelSenderConnections.setUpPerTestClass();
            TestGroupChannelSenderConnections objTestGroupChannelSenderConnections = new TestGroupChannelSenderConnections();
            objTestGroupChannelSenderConnections.setUp();
            objTestGroupChannelSenderConnections.testKeepAliveCount();
            objTestGroupChannelSenderConnections.tearDown();
            TestGroupChannelSenderConnections.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

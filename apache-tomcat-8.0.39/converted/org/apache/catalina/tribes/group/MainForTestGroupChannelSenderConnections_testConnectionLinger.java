package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelSenderConnections;

public class MainForTestGroupChannelSenderConnections_testConnectionLinger {
    public static void main(String[] args) {
        try {
            TestGroupChannelSenderConnections.setUpPerTestClass();
            TestGroupChannelSenderConnections objTestGroupChannelSenderConnections = new TestGroupChannelSenderConnections();
            objTestGroupChannelSenderConnections.setUp();
            objTestGroupChannelSenderConnections.testConnectionLinger();
            objTestGroupChannelSenderConnections.tearDown();
            TestGroupChannelSenderConnections.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

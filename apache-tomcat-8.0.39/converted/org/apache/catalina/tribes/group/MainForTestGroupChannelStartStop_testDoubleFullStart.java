package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelStartStop;

public class MainForTestGroupChannelStartStop_testDoubleFullStart {
    public static void main(String[] args) {
        try {
            TestGroupChannelStartStop objTestGroupChannelStartStop = new TestGroupChannelStartStop();
            objTestGroupChannelStartStop.setUp();
            objTestGroupChannelStartStop.testDoubleFullStart();
            objTestGroupChannelStartStop.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

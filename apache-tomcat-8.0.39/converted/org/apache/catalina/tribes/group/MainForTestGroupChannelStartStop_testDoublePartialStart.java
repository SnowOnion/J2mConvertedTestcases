package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelStartStop;

public class MainForTestGroupChannelStartStop_testDoublePartialStart {
    public static void main(String[] args) {
        try {
            TestGroupChannelStartStop objTestGroupChannelStartStop = new TestGroupChannelStartStop();
            objTestGroupChannelStartStop.setUp();
            objTestGroupChannelStartStop.testDoublePartialStart();
            objTestGroupChannelStartStop.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

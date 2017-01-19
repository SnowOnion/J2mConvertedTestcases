package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelStartStop;

public class MainForTestGroupChannelStartStop_testScrap {
    public static void main(String[] args) {
        try {
            TestGroupChannelStartStop objTestGroupChannelStartStop = new TestGroupChannelStartStop();
            objTestGroupChannelStartStop.setUp();
            objTestGroupChannelStartStop.testScrap();
            objTestGroupChannelStartStop.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

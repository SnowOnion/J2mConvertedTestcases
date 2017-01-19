package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelStartStop;

public class MainForTestGroupChannelStartStop_testUdpReceiverStart {
    public static void main(String[] args) {
        try {
            TestGroupChannelStartStop objTestGroupChannelStartStop = new TestGroupChannelStartStop();
            objTestGroupChannelStartStop.setUp();
            objTestGroupChannelStartStop.testUdpReceiverStart();
            objTestGroupChannelStartStop.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

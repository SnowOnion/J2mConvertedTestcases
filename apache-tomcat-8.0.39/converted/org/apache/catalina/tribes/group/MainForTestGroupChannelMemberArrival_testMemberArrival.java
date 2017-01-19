package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelMemberArrival;

public class MainForTestGroupChannelMemberArrival_testMemberArrival {
    public static void main(String[] args) {
        try {
            TestGroupChannelMemberArrival objTestGroupChannelMemberArrival = new TestGroupChannelMemberArrival();
            objTestGroupChannelMemberArrival.setUp();
            objTestGroupChannelMemberArrival.testMemberArrival();
            objTestGroupChannelMemberArrival.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

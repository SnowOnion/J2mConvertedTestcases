package org.apache.catalina.tribes.group;

import org.apache.catalina.tribes.group.TestGroupChannelOptionFlag;

public class MainForTestGroupChannelOptionFlag_testOptionNoConflict {
    public static void main(String[] args) {
        try {
            TestGroupChannelOptionFlag objTestGroupChannelOptionFlag = new TestGroupChannelOptionFlag();
            objTestGroupChannelOptionFlag.setUp();
            objTestGroupChannelOptionFlag.testOptionNoConflict();
            objTestGroupChannelOptionFlag.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

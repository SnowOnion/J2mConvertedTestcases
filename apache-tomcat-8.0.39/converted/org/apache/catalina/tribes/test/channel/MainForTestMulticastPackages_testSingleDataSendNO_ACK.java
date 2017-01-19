package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestMulticastPackages;

public class MainForTestMulticastPackages_testSingleDataSendNO_ACK {
    public static void main(String[] args) {
        try {
            TestMulticastPackages objTestMulticastPackages = new TestMulticastPackages();
            objTestMulticastPackages.setUp();
            objTestMulticastPackages.testSingleDataSendNO_ACK();
            objTestMulticastPackages.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

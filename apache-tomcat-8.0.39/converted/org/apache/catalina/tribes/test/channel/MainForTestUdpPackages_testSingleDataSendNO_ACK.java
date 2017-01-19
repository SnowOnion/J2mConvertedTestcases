package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestUdpPackages;

public class MainForTestUdpPackages_testSingleDataSendNO_ACK {
    public static void main(String[] args) {
        try {
            TestUdpPackages objTestUdpPackages = new TestUdpPackages();
            objTestUdpPackages.setUp();
            objTestUdpPackages.testSingleDataSendNO_ACK();
            objTestUdpPackages.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestMulticastPackages;

public class MainForTestMulticastPackages_testDataSendACK {
    public static void main(String[] args) {
        try {
            TestMulticastPackages objTestMulticastPackages = new TestMulticastPackages();
            objTestMulticastPackages.setUp();
            objTestMulticastPackages.testDataSendACK();
            objTestMulticastPackages.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

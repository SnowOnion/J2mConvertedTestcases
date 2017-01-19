package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestMulticastPackages;

public class MainForTestMulticastPackages_testDataSendASYNC {
    public static void main(String[] args) {
        try {
            TestMulticastPackages objTestMulticastPackages = new TestMulticastPackages();
            objTestMulticastPackages.setUp();
            objTestMulticastPackages.testDataSendASYNC();
            objTestMulticastPackages.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestDataIntegrity;

public class MainForTestDataIntegrity_testDataSendASYNC {
    public static void main(String[] args) {
        try {
            TestDataIntegrity objTestDataIntegrity = new TestDataIntegrity();
            objTestDataIntegrity.setUp();
            objTestDataIntegrity.testDataSendASYNC();
            objTestDataIntegrity.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

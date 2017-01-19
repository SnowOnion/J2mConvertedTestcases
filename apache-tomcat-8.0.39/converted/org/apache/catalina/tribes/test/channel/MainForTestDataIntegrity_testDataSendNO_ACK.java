package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestDataIntegrity;

public class MainForTestDataIntegrity_testDataSendNO_ACK {
    public static void main(String[] args) {
        try {
            TestDataIntegrity objTestDataIntegrity = new TestDataIntegrity();
            objTestDataIntegrity.setUp();
            objTestDataIntegrity.testDataSendNO_ACK();
            objTestDataIntegrity.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.tribes.test.channel;

import org.apache.catalina.tribes.test.channel.TestRemoteProcessException;

public class MainForTestRemoteProcessException_testDataSendSYNCACK {
    public static void main(String[] args) {
        try {
            TestRemoteProcessException objTestRemoteProcessException = new TestRemoteProcessException();
            objTestRemoteProcessException.setUp();
            objTestRemoteProcessException.testDataSendSYNCACK();
            objTestRemoteProcessException.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

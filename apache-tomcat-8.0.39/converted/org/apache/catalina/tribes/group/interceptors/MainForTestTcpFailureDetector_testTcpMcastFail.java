package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestTcpFailureDetector;

public class MainForTestTcpFailureDetector_testTcpMcastFail {
    public static void main(String[] args) {
        try {
            TestTcpFailureDetector objTestTcpFailureDetector = new TestTcpFailureDetector();
            objTestTcpFailureDetector.setUp();
            objTestTcpFailureDetector.testTcpMcastFail();
            objTestTcpFailureDetector.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

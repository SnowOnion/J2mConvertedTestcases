package org.apache.catalina.tribes.group.interceptors;

import org.apache.catalina.tribes.group.interceptors.TestTcpFailureDetector;

public class MainForTestTcpFailureDetector_testTcpSendFailureMemberDrop {
    public static void main(String[] args) {
        try {
            TestTcpFailureDetector objTestTcpFailureDetector = new TestTcpFailureDetector();
            objTestTcpFailureDetector.setUp();
            objTestTcpFailureDetector.testTcpSendFailureMemberDrop();
            objTestTcpFailureDetector.tearDown();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

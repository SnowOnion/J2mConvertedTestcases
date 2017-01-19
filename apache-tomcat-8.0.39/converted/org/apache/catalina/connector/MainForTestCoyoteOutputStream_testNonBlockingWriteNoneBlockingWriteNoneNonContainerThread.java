package org.apache.catalina.connector;

import org.apache.catalina.connector.TestCoyoteOutputStream;

public class MainForTestCoyoteOutputStream_testNonBlockingWriteNoneBlockingWriteNoneNonContainerThread {
    public static void main(String[] args) {
        try {
            TestCoyoteOutputStream.setUpPerTestClass();
            TestCoyoteOutputStream objTestCoyoteOutputStream = new TestCoyoteOutputStream();
            objTestCoyoteOutputStream.setUp();
            objTestCoyoteOutputStream.testNonBlockingWriteNoneBlockingWriteNoneNonContainerThread();
            objTestCoyoteOutputStream.tearDown();
            TestCoyoteOutputStream.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.connector;

import org.apache.catalina.connector.TestKeepAliveCount;

public class MainForTestKeepAliveCount_testHttp11 {
    public static void main(String[] args) {
        try {
            TestKeepAliveCount.setUpPerTestClass();
            TestKeepAliveCount objTestKeepAliveCount = new TestKeepAliveCount();
            objTestKeepAliveCount.setUp();
            objTestKeepAliveCount.testHttp11();
            objTestKeepAliveCount.tearDown();
            TestKeepAliveCount.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

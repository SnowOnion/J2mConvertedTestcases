package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TestNonBlockingAPI;

public class MainForTestNonBlockingAPI_testNonBlockingReadIgnoreIsReady {
    public static void main(String[] args) {
        try {
            TestNonBlockingAPI.setUpPerTestClass();
            TestNonBlockingAPI objTestNonBlockingAPI = new TestNonBlockingAPI();
            objTestNonBlockingAPI.setUp();
            objTestNonBlockingAPI.testNonBlockingReadIgnoreIsReady();
            objTestNonBlockingAPI.tearDown();
            TestNonBlockingAPI.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

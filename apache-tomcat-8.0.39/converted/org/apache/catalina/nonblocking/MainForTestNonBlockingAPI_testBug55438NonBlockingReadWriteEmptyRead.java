package org.apache.catalina.nonblocking;

import org.apache.catalina.nonblocking.TestNonBlockingAPI;

public class MainForTestNonBlockingAPI_testBug55438NonBlockingReadWriteEmptyRead {
    public static void main(String[] args) {
        try {
            TestNonBlockingAPI.setUpPerTestClass();
            TestNonBlockingAPI objTestNonBlockingAPI = new TestNonBlockingAPI();
            objTestNonBlockingAPI.setUp();
            objTestNonBlockingAPI.testBug55438NonBlockingReadWriteEmptyRead();
            objTestNonBlockingAPI.tearDown();
            TestNonBlockingAPI.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationHttpRequest;

public class MainForTestApplicationHttpRequest_testMergeQueryString01 {
    public static void main(String[] args) {
        try {
            TestApplicationHttpRequest.setUpPerTestClass();
            TestApplicationHttpRequest objTestApplicationHttpRequest = new TestApplicationHttpRequest();
            objTestApplicationHttpRequest.setUp();
            objTestApplicationHttpRequest.testMergeQueryString01();
            objTestApplicationHttpRequest.tearDown();
            TestApplicationHttpRequest.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

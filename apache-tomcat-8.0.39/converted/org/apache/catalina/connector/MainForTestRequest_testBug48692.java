package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_testBug48692 {
    public static void main(String[] args) {
        try {
            TestRequest.setup();
            TestRequest.setUpPerTestClass();
            TestRequest objTestRequest = new TestRequest();
            objTestRequest.setUp();
            objTestRequest.testBug48692();
            objTestRequest.tearDown();
            TestRequest.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

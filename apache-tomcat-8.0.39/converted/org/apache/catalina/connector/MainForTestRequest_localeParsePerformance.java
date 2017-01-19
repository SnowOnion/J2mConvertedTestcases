package org.apache.catalina.connector;

import org.apache.catalina.connector.TestRequest;

public class MainForTestRequest_localeParsePerformance {
    public static void main(String[] args) {
        try {
            TestRequest.setup();
            TestRequest.setUpPerTestClass();
            TestRequest objTestRequest = new TestRequest();
            objTestRequest.setUp();
            objTestRequest.localeParsePerformance();
            objTestRequest.tearDown();
            TestRequest.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

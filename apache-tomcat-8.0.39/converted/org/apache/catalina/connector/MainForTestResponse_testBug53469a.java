package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testBug53469a {
    public static void main(String[] args) {
        try {
            TestResponse.setUpPerTestClass();
            TestResponse objTestResponse = new TestResponse();
            objTestResponse.setUp();
            objTestResponse.testBug53469a();
            objTestResponse.tearDown();
            TestResponse.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

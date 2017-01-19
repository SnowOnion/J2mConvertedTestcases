package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testEncodeURL09 {
    public static void main(String[] args) {
        try {
            TestResponse.setUpPerTestClass();
            TestResponse objTestResponse = new TestResponse();
            objTestResponse.setUp();
            objTestResponse.testEncodeURL09();
            objTestResponse.tearDown();
            TestResponse.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

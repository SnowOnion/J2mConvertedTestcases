package org.apache.catalina.connector;

import org.apache.catalina.connector.TestResponse;

public class MainForTestResponse_testEncodeRedirectURL01 {
    public static void main(String[] args) {
        try {
            TestResponse.setUpPerTestClass();
            TestResponse objTestResponse = new TestResponse();
            objTestResponse.setUp();
            objTestResponse.testEncodeRedirectURL01();
            objTestResponse.tearDown();
            TestResponse.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestMimeHeadersIntegration;

public class MainForTestMimeHeadersIntegration_testHeaderLimits4 {
    public static void main(String[] args) {
        try {
            TestMimeHeadersIntegration.setUpPerTestClass();
            TestMimeHeadersIntegration objTestMimeHeadersIntegration = new TestMimeHeadersIntegration();
            objTestMimeHeadersIntegration.setUp();
            objTestMimeHeadersIntegration.testHeaderLimits4();
            objTestMimeHeadersIntegration.tearDown();
            TestMimeHeadersIntegration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

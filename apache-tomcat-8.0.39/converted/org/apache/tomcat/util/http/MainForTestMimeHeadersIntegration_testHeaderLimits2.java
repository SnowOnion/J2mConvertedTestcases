package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestMimeHeadersIntegration;

public class MainForTestMimeHeadersIntegration_testHeaderLimits2 {
    public static void main(String[] args) {
        try {
            TestMimeHeadersIntegration.setUpPerTestClass();
            TestMimeHeadersIntegration objTestMimeHeadersIntegration = new TestMimeHeadersIntegration();
            objTestMimeHeadersIntegration.setUp();
            objTestMimeHeadersIntegration.testHeaderLimits2();
            objTestMimeHeadersIntegration.tearDown();
            TestMimeHeadersIntegration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

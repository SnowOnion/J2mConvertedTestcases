package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieProcessorGenerationHttp;

public class MainForTestCookieProcessorGenerationHttp_testUtf8CookieValue {
    public static void main(String[] args) {
        try {
            TestCookieProcessorGenerationHttp.setUpPerTestClass();
            TestCookieProcessorGenerationHttp objTestCookieProcessorGenerationHttp = new TestCookieProcessorGenerationHttp();
            objTestCookieProcessorGenerationHttp.setUp();
            objTestCookieProcessorGenerationHttp.testUtf8CookieValue();
            objTestCookieProcessorGenerationHttp.tearDown();
            TestCookieProcessorGenerationHttp.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testRfc6265V1 {
    public static void main(String[] args) {
        try {
            TestCookieParsing.setUpPerTestClass();
            TestCookieParsing objTestCookieParsing = new TestCookieParsing();
            objTestCookieParsing.setUp();
            objTestCookieParsing.testRfc6265V1();
            objTestCookieParsing.tearDown();
            TestCookieParsing.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

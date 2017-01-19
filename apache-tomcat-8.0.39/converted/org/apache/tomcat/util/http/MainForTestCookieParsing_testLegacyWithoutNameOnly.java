package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithoutNameOnly {
    public static void main(String[] args) {
        try {
            TestCookieParsing.setUpPerTestClass();
            TestCookieParsing objTestCookieParsing = new TestCookieParsing();
            objTestCookieParsing.setUp();
            objTestCookieParsing.testLegacyWithoutNameOnly();
            objTestCookieParsing.tearDown();
            TestCookieParsing.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

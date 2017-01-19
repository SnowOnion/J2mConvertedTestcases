package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithoutEquals {
    public static void main(String[] args) {
        try {
            TestCookieParsing.setUpPerTestClass();
            TestCookieParsing objTestCookieParsing = new TestCookieParsing();
            objTestCookieParsing.setUp();
            objTestCookieParsing.testLegacyWithoutEquals();
            objTestCookieParsing.tearDown();
            TestCookieParsing.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

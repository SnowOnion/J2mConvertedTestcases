package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookiesNoStrictNamingSysProps;

public class MainForTestCookiesNoStrictNamingSysProps_testCookiesInstance {
    public static void main(String[] args) {
        try {
            TestCookiesNoStrictNamingSysProps.setUpPerTestClass();
            TestCookiesNoStrictNamingSysProps objTestCookiesNoStrictNamingSysProps = new TestCookiesNoStrictNamingSysProps();
            objTestCookiesNoStrictNamingSysProps.setUp();
            objTestCookiesNoStrictNamingSysProps.testCookiesInstance();
            objTestCookiesNoStrictNamingSysProps.tearDown();
            TestCookiesNoStrictNamingSysProps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

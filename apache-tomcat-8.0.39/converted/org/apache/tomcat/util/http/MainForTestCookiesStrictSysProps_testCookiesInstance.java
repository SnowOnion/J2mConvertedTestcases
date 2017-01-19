package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookiesStrictSysProps;

public class MainForTestCookiesStrictSysProps_testCookiesInstance {
    public static void main(String[] args) {
        try {
            TestCookiesStrictSysProps.setUpPerTestClass();
            TestCookiesStrictSysProps objTestCookiesStrictSysProps = new TestCookiesStrictSysProps();
            objTestCookiesStrictSysProps.setUp();
            objTestCookiesStrictSysProps.testCookiesInstance();
            objTestCookiesStrictSysProps.tearDown();
            TestCookiesStrictSysProps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

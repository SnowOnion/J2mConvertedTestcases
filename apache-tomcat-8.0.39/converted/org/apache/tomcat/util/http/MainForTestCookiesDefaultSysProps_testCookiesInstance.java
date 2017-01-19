package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookiesDefaultSysProps;

public class MainForTestCookiesDefaultSysProps_testCookiesInstance {
    public static void main(String[] args) {
        try {
            TestCookiesDefaultSysProps.setUpPerTestClass();
            TestCookiesDefaultSysProps objTestCookiesDefaultSysProps = new TestCookiesDefaultSysProps();
            objTestCookiesDefaultSysProps.setUp();
            objTestCookiesDefaultSysProps.testCookiesInstance();
            objTestCookiesDefaultSysProps.tearDown();
            TestCookiesDefaultSysProps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

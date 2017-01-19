package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookiesNoFwdStrictSysProps;

public class MainForTestCookiesNoFwdStrictSysProps_testCookiesInstance {
    public static void main(String[] args) {
        try {
            TestCookiesNoFwdStrictSysProps.setUpPerTestClass();
            TestCookiesNoFwdStrictSysProps objTestCookiesNoFwdStrictSysProps = new TestCookiesNoFwdStrictSysProps();
            objTestCookiesNoFwdStrictSysProps.setUp();
            objTestCookiesNoFwdStrictSysProps.testCookiesInstance();
            objTestCookiesNoFwdStrictSysProps.tearDown();
            TestCookiesNoFwdStrictSysProps.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestBug49158;

public class MainForTestBug49158_testCookiesInstance {
    public static void main(String[] args) {
        try {
            TestBug49158.setUpPerTestClass();
            TestBug49158 objTestBug49158 = new TestBug49158();
            objTestBug49158.setUp();
            objTestBug49158.testCookiesInstance();
            objTestBug49158.tearDown();
            TestBug49158.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

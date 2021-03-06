package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testAddFilterWithFilterNameEmptyString {
    public static void main(String[] args) {
        try {
            TestApplicationContext.setUpPerTestClass();
            TestApplicationContext objTestApplicationContext = new TestApplicationContext();
            objTestApplicationContext.setUp();
            objTestApplicationContext.testAddFilterWithFilterNameEmptyString();
            objTestApplicationContext.tearDown();
            TestApplicationContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

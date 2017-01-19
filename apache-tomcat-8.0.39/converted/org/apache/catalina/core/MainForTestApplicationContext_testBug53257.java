package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationContext;

public class MainForTestApplicationContext_testBug53257 {
    public static void main(String[] args) {
        try {
            TestApplicationContext.setUpPerTestClass();
            TestApplicationContext objTestApplicationContext = new TestApplicationContext();
            objTestApplicationContext.setUp();
            objTestApplicationContext.testBug53257();
            objTestApplicationContext.tearDown();
            TestApplicationContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

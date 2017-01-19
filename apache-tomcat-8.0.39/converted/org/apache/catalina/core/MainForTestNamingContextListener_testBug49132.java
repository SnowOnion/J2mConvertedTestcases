package org.apache.catalina.core;

import org.apache.catalina.core.TestNamingContextListener;

public class MainForTestNamingContextListener_testBug49132 {
    public static void main(String[] args) {
        try {
            TestNamingContextListener.setUpPerTestClass();
            TestNamingContextListener objTestNamingContextListener = new TestNamingContextListener();
            objTestNamingContextListener.setUp();
            objTestNamingContextListener.testBug49132();
            objTestNamingContextListener.tearDown();
            TestNamingContextListener.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

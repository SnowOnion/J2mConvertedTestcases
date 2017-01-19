package org.apache.catalina.core;

import org.apache.catalina.core.TestNamingContextListener;

public class MainForTestNamingContextListener_testBug54096 {
    public static void main(String[] args) {
        try {
            TestNamingContextListener.setUpPerTestClass();
            TestNamingContextListener objTestNamingContextListener = new TestNamingContextListener();
            objTestNamingContextListener.setUp();
            objTestNamingContextListener.testBug54096();
            objTestNamingContextListener.tearDown();
            TestNamingContextListener.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

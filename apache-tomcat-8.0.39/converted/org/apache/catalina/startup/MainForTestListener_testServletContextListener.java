package org.apache.catalina.startup;

import org.apache.catalina.startup.TestListener;

public class MainForTestListener_testServletContextListener {
    public static void main(String[] args) {
        try {
            TestListener.setUpPerTestClass();
            TestListener objTestListener = new TestListener();
            objTestListener.setUp();
            objTestListener.testServletContextListener();
            objTestListener.tearDown();
            TestListener.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

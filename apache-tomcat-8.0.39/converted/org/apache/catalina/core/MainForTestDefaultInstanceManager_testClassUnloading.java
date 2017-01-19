package org.apache.catalina.core;

import org.apache.catalina.core.TestDefaultInstanceManager;

public class MainForTestDefaultInstanceManager_testClassUnloading {
    public static void main(String[] args) {
        try {
            TestDefaultInstanceManager.setUpPerTestClass();
            TestDefaultInstanceManager objTestDefaultInstanceManager = new TestDefaultInstanceManager();
            objTestDefaultInstanceManager.setUp();
            objTestDefaultInstanceManager.testClassUnloading();
            objTestDefaultInstanceManager.tearDown();
            TestDefaultInstanceManager.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

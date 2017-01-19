package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testBug54379 {
    public static void main(String[] args) {
        try {
            TestContextConfig.setUpPerTestClass();
            TestContextConfig objTestContextConfig = new TestContextConfig();
            objTestContextConfig.setUp();
            objTestContextConfig.testBug54379();
            objTestContextConfig.tearDown();
            TestContextConfig.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

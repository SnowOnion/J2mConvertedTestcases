package org.apache.catalina.core;

import org.apache.catalina.core.TestApplicationFilterConfig;

public class MainForTestApplicationFilterConfig_testBug54170 {
    public static void main(String[] args) {
        try {
            TestApplicationFilterConfig.setUpPerTestClass();
            TestApplicationFilterConfig objTestApplicationFilterConfig = new TestApplicationFilterConfig();
            objTestApplicationFilterConfig.setUp();
            objTestApplicationFilterConfig.testBug54170();
            objTestApplicationFilterConfig.tearDown();
            TestApplicationFilterConfig.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

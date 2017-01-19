package org.apache.catalina.startup;

import org.apache.catalina.startup.TestContextConfig;

public class MainForTestContextConfig_testOverrideWithSCIDefaultMapping {
    public static void main(String[] args) {
        try {
            TestContextConfig.setUpPerTestClass();
            TestContextConfig objTestContextConfig = new TestContextConfig();
            objTestContextConfig.setUp();
            objTestContextConfig.testOverrideWithSCIDefaultMapping();
            objTestContextConfig.tearDown();
            TestContextConfig.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

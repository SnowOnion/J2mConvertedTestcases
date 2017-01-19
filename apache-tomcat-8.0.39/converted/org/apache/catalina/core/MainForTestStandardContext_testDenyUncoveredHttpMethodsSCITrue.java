package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testDenyUncoveredHttpMethodsSCITrue {
    public static void main(String[] args) {
        try {
            TestStandardContext.setUpPerTestClass();
            TestStandardContext objTestStandardContext = new TestStandardContext();
            objTestStandardContext.setUp();
            objTestStandardContext.testDenyUncoveredHttpMethodsSCITrue();
            objTestStandardContext.tearDown();
            TestStandardContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

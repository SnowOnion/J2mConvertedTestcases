package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testAddPostConstructMethodConflicts {
    public static void main(String[] args) {
        try {
            TestStandardContext.setUpPerTestClass();
            TestStandardContext objTestStandardContext = new TestStandardContext();
            objTestStandardContext.setUp();
            objTestStandardContext.testAddPostConstructMethodConflicts();
            objTestStandardContext.tearDown();
            TestStandardContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

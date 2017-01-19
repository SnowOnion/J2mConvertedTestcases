package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContext;

public class MainForTestStandardContext_testBug56085 {
    public static void main(String[] args) {
        try {
            TestStandardContext.setUpPerTestClass();
            TestStandardContext objTestStandardContext = new TestStandardContext();
            objTestStandardContext.setUp();
            objTestStandardContext.testBug56085();
            objTestStandardContext.tearDown();
            TestStandardContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

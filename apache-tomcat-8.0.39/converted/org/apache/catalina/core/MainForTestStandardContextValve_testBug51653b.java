package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextValve;

public class MainForTestStandardContextValve_testBug51653b {
    public static void main(String[] args) {
        try {
            TestStandardContextValve.setUpPerTestClass();
            TestStandardContextValve objTestStandardContextValve = new TestStandardContextValve();
            objTestStandardContextValve.setUp();
            objTestStandardContextValve.testBug51653b();
            objTestStandardContextValve.tearDown();
            TestStandardContextValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

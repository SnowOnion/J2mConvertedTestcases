package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardContextValve;

public class MainForTestStandardContextValve_testBug51653a {
    public static void main(String[] args) {
        try {
            TestStandardContextValve.setUpPerTestClass();
            TestStandardContextValve objTestStandardContextValve = new TestStandardContextValve();
            objTestStandardContextValve.setUp();
            objTestStandardContextValve.testBug51653a();
            objTestStandardContextValve.tearDown();
            TestStandardContextValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

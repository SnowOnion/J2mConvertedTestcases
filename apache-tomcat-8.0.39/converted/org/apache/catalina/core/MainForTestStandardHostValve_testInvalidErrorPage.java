package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardHostValve;

public class MainForTestStandardHostValve_testInvalidErrorPage {
    public static void main(String[] args) {
        try {
            TestStandardHostValve.setUpPerTestClass();
            TestStandardHostValve objTestStandardHostValve = new TestStandardHostValve();
            objTestStandardHostValve.setUp();
            objTestStandardHostValve.testInvalidErrorPage();
            objTestStandardHostValve.tearDown();
            TestStandardHostValve.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

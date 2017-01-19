package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testSecurityAnnotationsUncoveredGet04 {
    public static void main(String[] args) {
        try {
            TestStandardWrapper.setUpPerTestClass();
            TestStandardWrapper objTestStandardWrapper = new TestStandardWrapper();
            objTestStandardWrapper.setUp();
            objTestStandardWrapper.testSecurityAnnotationsUncoveredGet04();
            objTestStandardWrapper.tearDown();
            TestStandardWrapper.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

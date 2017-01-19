package org.apache.catalina.session;

import org.apache.catalina.session.TestStandardSessionIntegration;

public class MainForTestStandardSessionIntegration_testBug56578a {
    public static void main(String[] args) {
        try {
            TestStandardSessionIntegration.setUpPerTestClass();
            TestStandardSessionIntegration objTestStandardSessionIntegration = new TestStandardSessionIntegration();
            objTestStandardSessionIntegration.setUp();
            objTestStandardSessionIntegration.testBug56578a();
            objTestStandardSessionIntegration.tearDown();
            TestStandardSessionIntegration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

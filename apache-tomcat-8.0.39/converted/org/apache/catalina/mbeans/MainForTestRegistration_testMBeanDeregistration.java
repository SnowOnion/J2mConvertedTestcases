package org.apache.catalina.mbeans;

import org.apache.catalina.mbeans.TestRegistration;

public class MainForTestRegistration_testMBeanDeregistration {
    public static void main(String[] args) {
        try {
            TestRegistration.setUpPerTestClass();
            TestRegistration objTestRegistration = new TestRegistration();
            objTestRegistration.setUp();
            objTestRegistration.testMBeanDeregistration();
            objTestRegistration.tearDown();
            TestRegistration.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

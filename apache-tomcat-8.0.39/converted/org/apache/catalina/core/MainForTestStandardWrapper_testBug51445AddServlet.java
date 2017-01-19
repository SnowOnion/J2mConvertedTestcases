package org.apache.catalina.core;

import org.apache.catalina.core.TestStandardWrapper;

public class MainForTestStandardWrapper_testBug51445AddServlet {
    public static void main(String[] args) {
        try {
            TestStandardWrapper.setUpPerTestClass();
            TestStandardWrapper objTestStandardWrapper = new TestStandardWrapper();
            objTestStandardWrapper.setUp();
            objTestStandardWrapper.testBug51445AddServlet();
            objTestStandardWrapper.tearDown();
            TestStandardWrapper.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

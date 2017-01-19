package org.apache.naming;

import org.apache.naming.TestNamingContext;

public class MainForTestNamingContext_testGlobalNaming {
    public static void main(String[] args) {
        try {
            TestNamingContext.setUpPerTestClass();
            TestNamingContext objTestNamingContext = new TestNamingContext();
            objTestNamingContext.setUp();
            objTestNamingContext.testGlobalNaming();
            objTestNamingContext.tearDown();
            TestNamingContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

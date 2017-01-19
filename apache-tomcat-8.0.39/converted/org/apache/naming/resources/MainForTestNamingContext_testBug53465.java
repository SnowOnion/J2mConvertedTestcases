package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testBug53465 {
    public static void main(String[] args) {
        try {
            TestNamingContext.setUpPerTestClass();
            TestNamingContext objTestNamingContext = new TestNamingContext();
            objTestNamingContext.setUp();
            objTestNamingContext.testBug53465();
            objTestNamingContext.tearDown();
            TestNamingContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

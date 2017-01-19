package org.apache.naming.resources;

import org.apache.naming.resources.TestNamingContext;

public class MainForTestNamingContext_testLookupNonSingletonResource {
    public static void main(String[] args) {
        try {
            TestNamingContext.setUpPerTestClass();
            TestNamingContext objTestNamingContext = new TestNamingContext();
            objTestNamingContext.setUp();
            objTestNamingContext.testLookupNonSingletonResource();
            objTestNamingContext.tearDown();
            TestNamingContext.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

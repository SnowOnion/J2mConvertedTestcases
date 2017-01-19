package org.apache.catalina.filters;

import org.apache.catalina.filters.TestExpiresFilter;

public class MainForTestExpiresFilter_testIntsToCommaDelimitedString {
    public static void main(String[] args) {
        try {
            TestExpiresFilter.setUpPerTestClass();
            TestExpiresFilter objTestExpiresFilter = new TestExpiresFilter();
            objTestExpiresFilter.setUp();
            objTestExpiresFilter.testIntsToCommaDelimitedString();
            objTestExpiresFilter.tearDown();
            TestExpiresFilter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

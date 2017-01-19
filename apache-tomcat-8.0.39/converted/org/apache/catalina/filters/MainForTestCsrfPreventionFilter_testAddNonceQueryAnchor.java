package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testAddNonceQueryAnchor {
    public static void main(String[] args) {
        try {
            TestCsrfPreventionFilter.setUpPerTestClass();
            TestCsrfPreventionFilter objTestCsrfPreventionFilter = new TestCsrfPreventionFilter();
            objTestCsrfPreventionFilter.setUp();
            objTestCsrfPreventionFilter.testAddNonceQueryAnchor();
            objTestCsrfPreventionFilter.tearDown();
            TestCsrfPreventionFilter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

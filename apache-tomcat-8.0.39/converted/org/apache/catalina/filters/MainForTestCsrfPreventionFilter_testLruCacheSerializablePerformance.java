package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter;

public class MainForTestCsrfPreventionFilter_testLruCacheSerializablePerformance {
    public static void main(String[] args) {
        try {
            TestCsrfPreventionFilter.setUpPerTestClass();
            TestCsrfPreventionFilter objTestCsrfPreventionFilter = new TestCsrfPreventionFilter();
            objTestCsrfPreventionFilter.setUp();
            objTestCsrfPreventionFilter.testLruCacheSerializablePerformance();
            objTestCsrfPreventionFilter.tearDown();
            TestCsrfPreventionFilter.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCsrfPreventionFilter2;

public class MainForTestCsrfPreventionFilter2_testLruCacheConcurrency {
    public static void main(String[] args) {
        try {
            TestCsrfPreventionFilter2 objTestCsrfPreventionFilter2 = new TestCsrfPreventionFilter2();
            objTestCsrfPreventionFilter2.testLruCacheConcurrency();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestNoSessionNoNonce {
    public static void main(String[] args) {
        try {
            TestRestCsrfPreventionFilter objTestRestCsrfPreventionFilter = new TestRestCsrfPreventionFilter();
            objTestRestCsrfPreventionFilter.setUp();
            objTestRestCsrfPreventionFilter.testPostRequestNoSessionNoNonce();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

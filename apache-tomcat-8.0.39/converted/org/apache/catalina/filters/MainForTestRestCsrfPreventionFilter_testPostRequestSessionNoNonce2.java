package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter;

public class MainForTestRestCsrfPreventionFilter_testPostRequestSessionNoNonce2 {
    public static void main(String[] args) {
        try {
            TestRestCsrfPreventionFilter objTestRestCsrfPreventionFilter = new TestRestCsrfPreventionFilter();
            objTestRestCsrfPreventionFilter.setUp();
            objTestRestCsrfPreventionFilter.testPostRequestSessionNoNonce2();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

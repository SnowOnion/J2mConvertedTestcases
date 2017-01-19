package org.apache.catalina.filters;

import org.apache.catalina.filters.TestRestCsrfPreventionFilter2;

public class MainForTestRestCsrfPreventionFilter2_testRestCsrfProtectionWithHeader {
    public static void main(String[] args) {
        try {
            TestRestCsrfPreventionFilter2.setUpPerTestClass();
            TestRestCsrfPreventionFilter2 objTestRestCsrfPreventionFilter2 = new TestRestCsrfPreventionFilter2();
            objTestRestCsrfPreventionFilter2.testRestCsrfProtectionWithHeader();
            objTestRestCsrfPreventionFilter2.tearDown();
            TestRestCsrfPreventionFilter2.tearDownPerTestClass();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

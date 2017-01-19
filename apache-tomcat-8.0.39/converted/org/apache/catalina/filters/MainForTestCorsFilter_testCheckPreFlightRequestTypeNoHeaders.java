package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeNoHeaders {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckPreFlightRequestTypeNoHeaders();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeUnsupportedRequestHeaders {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckPreFlightRequestTypeUnsupportedRequestHeaders();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

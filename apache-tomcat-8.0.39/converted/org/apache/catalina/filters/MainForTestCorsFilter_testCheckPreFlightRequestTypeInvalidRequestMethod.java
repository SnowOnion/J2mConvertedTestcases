package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeInvalidRequestMethod {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckPreFlightRequestTypeInvalidRequestMethod();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

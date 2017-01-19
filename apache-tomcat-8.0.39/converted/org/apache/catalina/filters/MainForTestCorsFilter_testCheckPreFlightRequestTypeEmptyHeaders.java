package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeEmptyHeaders {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckPreFlightRequestTypeEmptyHeaders();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

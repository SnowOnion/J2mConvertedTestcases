package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeNoACRM {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckPreFlightRequestTypeNoACRM();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

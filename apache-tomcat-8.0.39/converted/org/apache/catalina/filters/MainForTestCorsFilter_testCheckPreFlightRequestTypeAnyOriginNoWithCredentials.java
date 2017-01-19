package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckPreFlightRequestTypeAnyOriginNoWithCredentials {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckPreFlightRequestTypeAnyOriginNoWithCredentials();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

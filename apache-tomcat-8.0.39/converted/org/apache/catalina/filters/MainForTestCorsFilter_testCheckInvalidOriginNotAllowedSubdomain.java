package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckInvalidOriginNotAllowedSubdomain {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckInvalidOriginNotAllowedSubdomain();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

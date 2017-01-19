package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckActualRequestTypeMethodPOSTNotSimpleHeaders {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckActualRequestTypeMethodPOSTNotSimpleHeaders();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

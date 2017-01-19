package org.apache.catalina.filters;

import org.apache.catalina.filters.TestCorsFilter;

public class MainForTestCorsFilter_testCheckSimpleRequestTypeAnyOrigin {
    public static void main(String[] args) {
        try {
            TestCorsFilter objTestCorsFilter = new TestCorsFilter();
            objTestCorsFilter.testCheckSimpleRequestTypeAnyOrigin();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
